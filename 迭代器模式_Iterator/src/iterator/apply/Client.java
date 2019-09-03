package iterator.apply;

/**
 * @author Mapleins
 * @date 2019-08-29 11:07
 * @description TODO
 */
public class Client {

    public static void main(String[] args) {
        Container container = new ContainerImpl();
        container.add("hello");
        container.add("iterator");
        Iterator iterator = container.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
