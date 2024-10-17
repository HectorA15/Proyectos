import java.io.*;


public class CreateText {

    public void CrearTxt(){

        File archivo = new File("archivo.txt");

        try{
            if(archivo.createNewFile()){
                System.out.println("El archivo se ha guardado correctamente");
            }
            else{
                System.out.println("El archivo no se ha guardado correctamente");
            }
        }catch(IOException e){
            e.printStackTrace(System.out);
        }
    }
}
