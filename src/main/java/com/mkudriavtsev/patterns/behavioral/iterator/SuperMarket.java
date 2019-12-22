package main.java.com.mkudriavtsev.patterns.behavioral.iterator;

public class SuperMarket implements Collection {
    private String name;
    private String[] goods;

    public SuperMarket(String name, String[] goods) {
        this.name = name;
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getGoods() {
        return goods;
    }

    public void setGoods(String[] goods) {
        this.goods = goods;
    }

    @Override
    public Iterator getIterator() {
        return new GoodsIterator();
    }

    private class GoodsIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < goods.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return goods[index++];
        }
    }
}
