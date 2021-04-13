import java.util.HashMap;

public class CustomerStorage
{
    private HashMap<String, Customer> storage;

    public CustomerStorage()
    {
        storage = new HashMap<>();
    }

    public void addCustomer(String data)
    {

            String[] components = data.split("\\s+");
            if(components.length !=4 ) {
                throw new IllegalArgumentException("Wrong format. Correct format: \n"+"add Василий Петров vasily.petrov@gmail.com +79215637722");
            } else  if (!components[2].contains("@")&&!components[1].contains(".")) {
                System.out.println("Mail not correct. Symbol @ or . not found");
            }  else  if (components[3].length() != 12) {
                System.out.println("Phone number not correct, Correct format: \n"+" +79215637722 ( + and 11 digits merged ) ");
            }
            else {
                String name = components[0] + " " + components[1];

                storage.put(name, new Customer(name, components[3], components[2]));
            }

    }

    public void listCustomers()
    {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name)
    {
        storage.remove(name);
    }

    public int getCount()
    {
        return storage.size();
    }
}