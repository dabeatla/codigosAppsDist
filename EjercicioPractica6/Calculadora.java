package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Calculadora")
public class Calculadora {

    @WebMethod(operationName = "Calculadora")
    public int Calculadora(@WebParam(name = "valor1") int valor1, @WebParam(name = "valor2") int valor2, @WebParam(name = "condicional") int condicional) {
        int resultado=0;
        switch(condicional){
            case 1:{
            resultado=valor1-valor2;}break;
            case 2:{
            resultado=valor1+valor2;}break;
            case 3:{
            resultado=valor1*valor2;}break;
            case 4:{
            resultado=valor1/valor2;}break;
            
            default:{resultado=00;}break;
        }
        return resultado;
    }    
}
