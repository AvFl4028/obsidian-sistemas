package Inv;

public class ProductoNoExisteException extends Exception{
    public ProductoNoExisteException(String msg){
        super(msg);
    }

    public ProductoNoExisteException(){
        super("-----------------------------------\nEl producto no existe\n-----------------------------------");
    }
}
