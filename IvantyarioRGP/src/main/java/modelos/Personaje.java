package modelos;

import java.util.*;

public class Personaje {
    /**
     *
     */
    private String nombre;
    private Map<String, Item> inventario;
    private Map<TipoEquipamiento, Item> equipamiento;

    /**
     *
     * @param nombre
     */

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.inventario = new HashMap<>();
        this.equipamiento = new HashMap<>();
    }

    /**
     *
     * @param item
     */

    public void agregarItemInventario(Item item) {
        this.inventario.put(item.getNombre(), item);
    }

    public void añadirAlInventario(Item item) {
        if (item != null) {
            inventario.put(item.getNombre(), item);
            System.out.println(item.getNombre() + " añadido al inventario.");
        }
    }

    /**
     *
     * @param nombreItem
     */

    public void eliminarDelInventario(String nombreItem) {
        this.inventario.remove(nombreItem);
    }

    public List<Item> getInventario() {
        return new ArrayList<>(inventario.values());
    }

    /**
     *
     * @param nombreItem
     * @return
     */


    public Item buscarItem(String nombreItem) {
        return inventario.get(nombreItem);
    }

}


