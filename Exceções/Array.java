public class Array {
   public static void main(String[] args) {
       
int Array[] = {10,20,30,40};
int indice = 5;
try {
    System.out.println(" elemento do array "+ indice+":"+ Array[indice]);
} catch (Exception e) {
    System.out.println("indice não existe");
    // TODO: handle exception
}finally{
System.out.println("finalizado");

}




   } 
}