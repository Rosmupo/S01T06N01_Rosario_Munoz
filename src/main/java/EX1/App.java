package EX1;

//Crea una classe anomenada EX1.NoGenericMethods que
// emmagatzemi tres objectes del mateix tipus, juntament
// amb els mètodes per a emmagatzemar i extreure aquests
// objectes i un constructor per a inicialitzar els tres.
// Comprova que els arguments es poden posar en qualsevol
// posició en la crida al constructor.

public class App {

    public static void main(String[] args) {

        char letra = 'c';
        int num = 6;

        NoGenericMethods.printNoGenericMethods((new Persona("María", "Pérez", 60)), letra, num);
    }
}
