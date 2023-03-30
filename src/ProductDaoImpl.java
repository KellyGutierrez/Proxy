public class ProductDaoImpl implements ProductDao {
    //Simulación de búsqueda por ID.
    public Product findById(int id) {
        System.out.println("Buscando el producto de ID " + id);
        //Como el proceso de búsqueda y almacenamiento aún no existe, se crea un objeto nuevo con el ID buscado.
        return new Product("Ejemplo", 123);
    }
}
