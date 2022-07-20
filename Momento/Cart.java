public class Cart {
    ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }
//clone - modification should not affect the currrent oblect
    public ArrayList<Item> getItems() {
        return (ArrayList<Item>) items.clone;
    }

    static class CartMomento{
        ArrayList<Item> items;

        public CartMomento(ArrayList<Items> items){
            this.items = items;
        }
        public void revert(CartMomento cartMomento)
            items = cartMomento.getItems();
    }
}
