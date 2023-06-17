package com.designpattern.behaviorPattern.iterator;

/**
 * @author zhongtao
 * @date 2023/6/17 18:48
 */
public class NameRepository implements Container {
    public String[] names = {"1", "2", "3", "4"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}