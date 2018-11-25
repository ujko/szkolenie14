package day5;

import java.io.*;

public class ObjectIO {

    private Animal setAnimal(){
        Animal zebra = new Animal("czrnobiały","ssak","Pimpus");
       // return new Animal("czrnobiały","ssak","Pimpus"); anonimowo zwracamy obiekt
        return zebra;
    }
    private void writeAnimal(Animal animal) throws IOException {
        File file = new File("zebra.dat");
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(animal);
        objectOutputStream.flush();
        objectOutputStream.close();
        outputStream.close();
    }

    private  Animal readAnimal() throws IOException, ClassNotFoundException {
        File file = new File("zebra.dat");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Animal animal = (Animal) objectInputStream.readObject();
        return animal;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectIO objectIO = new ObjectIO();
        //Animal animal = objectIO.setAnimal();
       // objectIO.writeAnimal(animal);
        Animal animal = objectIO.readAnimal();
        System.out.println(animal);
    }
}
