import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Persona_metodo_main {
    public Persona_metodo_main() {
    }

    public static void main(String[] args) {

        // Crear 5 objetos de Persona con nombres y apellidos aleatorios
        
        Persona persona1 = new Persona("María Antonieta", "González Navarro");
        Persona persona2 = new Persona("Ana Luisa", "López Pereira");
        Persona persona3 = new Persona("Juan Antonio", "Martínez Rios");
        Persona persona4 = new Persona("Pedro Alfredo", "Sánchez Fernandez");
        Persona persona5 = new Persona("Juan Luis", "Pérez Fonseca");
        List<Persona> listaPersonas = new ArrayList<>();
        
        // Agregar los objetos a una lista
        
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);

        // Ordenar la lista alfabéticamente por nombre
        
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getNombre));
        System.out.println("Ordenado por nombre:");
        listaPersonas.forEach((persona) -> {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        });

        // Ordenar la lista alfabéticamente por apellido
        
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido));
        System.out.println("\nOrdenado por apellido:");
        listaPersonas.forEach((persona) -> {
            System.out.println(persona.getApellido() + " " + persona.getNombre());
        });

        // Ordenar la lista inversamente por apellido
        
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("\nOrdenado inversamente por apellido:");
        listaPersonas.forEach((persona) -> {
            System.out.println(persona.getApellido() + " " + persona.getNombre());
        });
    }
}
