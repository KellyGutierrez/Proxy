public class ProductDaoProxyService {
    //Se crea el método principal.
    public static void main(String[] args) {
        //Se crea un objeto de tipo ProductDaoImpl, que tiene un método prototipo para realizar la "búsqueda".
        ProductDao productDao = new ProductDaoImpl();
        //Se crea un objeto de tipo ProductDaoProxy.
        ProductDaoProxy productDaoProxy = new ProductDaoProxy(productDao);
        //Ejemplo de "búsqueda" sin Proxy.
        System.out.println("\nEjemplo sin Proxy:");
        Product product1 = productDao.findById(123);
        //Ejemplo de "búsqueda" con Proxy.
        System.out.println("\nEjemplo con Proxy:");
        Product product2 = productDaoProxy.findById(123);
    }
}
