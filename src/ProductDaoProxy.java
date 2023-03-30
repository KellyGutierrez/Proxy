public class ProductDaoProxy implements ProductDao{
    //Constante que almacena un objeto de tipo ProductDao.
    private final ProductDao productDao;
    //Constructor que recibe un objeto de tipo ProductDao.
    public ProductDaoProxy (ProductDao productDao) {

        this.productDao = productDao;
    }
    //Método de búsqueda por ID con las modificaciones de ejemplo del Proxy.
    public Product findById(int id) {
        //Línea de texto agregada en el método del Proxy sin modificar el original.
        System.out.println("Paso agregado por Proxy antes de buscar.");
        //"Búsqueda" del producto por ID.
        Product product = this.productDao.findById(id);
        //Línea de texto agregada en el método del Proxy sin modificar el original.
        System.out.println("Paso agregado por Proxy después de buscar");
        //Se retorna el objeto "encontrado".
        return product;
    }
}
