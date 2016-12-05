package fr.pizzeria.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import fr.pizzeria.excepetion.PizzaException;
import fr.pizzeria.model.Pizza;

public class PizzaDaoFileFactory implements PizzaDaoFactory {

	// private List<Pizza> pizzas = new ArrayList<Pizza>();
	private String folderPath = "KEB.properties";
	private Properties prop;

	@Override
	public List<Pizza> findAllPizzas() throws IOException, InstantiationException, IllegalAccessException {
		List<Pizza> pizzas = new ArrayList<Pizza>();
		File f = new File(folderPath);
		System.out.println("f : " + f);
		ArrayList<String> files = new ArrayList<String>(Arrays.asList(f.list()));
		files.forEach(System.out::println);

		for (String filePath : files) {
			String path = folderPath + filePath;
			InputStream input = new FileInputStream(path);
			// Field[] champs = Pizza.class.getDeclaredFields();
			List<Field> fields = new ArrayList<>(Arrays.asList(Pizza.class.getDeclaredFields()));
			Pizza pizza = Pizza.class.newInstance();
			// System.out.println(input + " prop : " + prop);

			// chargement des donn�es du fichier
			getProp().load(input);

			// list des valeurs des champs de la classe pizza
			Set<Object> fieldValues = prop.keySet();
			// set.forEach(System.out::println);

			fields.forEach(v -> {
				System.out.println(v.getName());
			});
			fieldValues.forEach(value -> {

				Field field = fields.stream().filter(a -> a.getName().equals(value.toString())).findFirst()
						.orElse(null);
				field.setAccessible(true);

				try {
					System.out.println("value of : "
							+ field.getType().getDeclaredMethod("valueOf").invoke(null, getProp().get(value)));
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
						| NoSuchMethodException | SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				System.out.println("field name : " + field.getName());
				System.out.println("value key : " + getProp().get(value));
				if (field != null) {

					try {

						// Pizza pizza = new Pizza();
						field.set(pizza, getProp().get(value));
						// System.out.println("prop : " + getProp().get(field));

					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			});
			// Field fi = null;
			// for (Object object : set) {
			//
			// for (Field ch : champs) {
			// if (object.toString() == ch.getName()) {
			// System.out.println("field : " + ch);
			// }
			// }
			//
			// }

			// pizzas.add(new Pizza(id, code, nom, prix))
			// getProp().getProperty(field.getName());

		}

		return null;

	}

	@Override
	public boolean addPizza(Pizza pizza)
			throws PizzaException, IllegalArgumentException, IllegalAccessException, IOException {
		String filename = folderPath + pizza.getCode() + ".properties";
		OutputStream output = new FileOutputStream(filename);

		Field[] champs = Pizza.class.getDeclaredFields();
		for (Field field : champs) {
			if (field != null && field.getName() != "nbPizzas") {
				field.setAccessible(true);
				getProp().setProperty(field.getName(), field.get(pizza).toString());
				// field.getName();
				// field.get(pizza);
			}
		}
		prop.store(output, null);

		output.close();
		return true;
	}

	@Override
	public boolean updatePizza(Pizza pizza) throws PizzaException, FileNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePizza(Pizza pizza) throws PizzaException, FileNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Pizza getPizzaByCode(Object code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pizza getPizzaByPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		return null;
	}

	public Properties getProp() {
		if (prop == null)
			prop = new Properties();

		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	// public void savePizzasFile(String filename, Pizza pizza) throws
	// FileNotFoundException {
	// PrintWriter pw = new PrintWriter(new FileOutputStream(filename));
	// pizzas.forEach(value -> {
	// pw.println(value);
	// });
	//
	// pw.close();
	// }

}
