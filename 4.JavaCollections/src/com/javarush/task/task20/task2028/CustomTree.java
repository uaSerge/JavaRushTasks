package com.javarush.task.task20.task2028;


import java.io.Serializable;
import java.util.*;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList <String> implements Cloneable,Serializable{

    Entry <String> root = new Entry<String>("0");
    private int size;
    Entry rootFound = null;
    int countRemoveEntrys = 0;
//    {
//        queue.add(root);
//    }

    public static void main(String[] args) {
        List<String> list = new CustomTree();

        for (int i = 1; i <= 16; i++) {
            list.add(String.valueOf(i));
 //           System.out.println(i);
        }
//        list.remove("16");
        System.out.println(list.size());
        System.out.println("Expected 3, actual is " + ((CustomTree) list).getParent("8"));
//        list.remove("5");
        System.out.println("Expected null, actual is " + ((CustomTree) list).getParent("11"));
        System.out.println(((CustomTree) list).size);
        list.remove("2");
        System.out.println(((CustomTree) list).size);

    }

    static class Entry <T>  implements Serializable{
        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry <T> parent, leftChild, rightChild;


        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        void checkChildren (){
            if (leftChild != null) availableToAddLeftChildren = false;
            if (rightChild != null) availableToAddRightChildren = false;
        }
        boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
     //   return null;
    }

    @Override
    public String set(int index, String element) {
        return super.set(index, element);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(String elementName) {
        try {
//        if (root.elementName.equals("0"))
//        {
//            root = new Entry<String>(elementName);
//            size++;
//            return true;
//        }

        List<Entry<String>> queue = new ArrayList<>();
        Entry<String> iter = root;
        if (!iter.isAvailableToAddChildren())
        {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            Entry<String> temp = queue.get(0);
            if (temp.leftChild != null && temp.leftChild.isAvailableToAddChildren())
            {
                iter = temp.leftChild;
                break;
            }
            else if (temp.rightChild != null && temp.rightChild.isAvailableToAddChildren())
            {
                iter = temp.rightChild;
                break;
            }
            if (temp.leftChild != null)
                queue.add(queue.size(), temp.leftChild);
            if (temp.rightChild != null)
                queue.add(queue.size(), temp.rightChild);
            queue.remove(0);
        }

        if (iter.availableToAddLeftChildren) {
            iter.leftChild = new Entry<>(elementName);
            iter.leftChild.parent = iter;
            iter.checkChildren();
        } else {
            iter.rightChild = new Entry<>(elementName);
            iter.rightChild.parent = iter;
            iter.checkChildren();
        }
        size++;
    } catch (Exception e) {
        return false;
    }
    return true;
    }

    @Override
    public boolean remove(Object o) {
        rootFound = null;
        String s = (String) o;
        findEntry(root, s);
        if (rootFound ==(null)) return false;
        else {
            size--;
            Entry rootRem = rootFound;
            if (rootRem.leftChild !=(null)|| rootRem.rightChild != (null)) {
                countRemoveEntry(rootRem);
            }

            rootFound = rootFound.parent;
            if (rootFound.leftChild.elementName.equals(s)) rootFound.leftChild = null;
            else rootFound.rightChild = null;
        }
        size -= countRemoveEntrys;
        countRemoveEntrys = 0;
        return true;
    }
    private void countRemoveEntry(Entry<String> rootRemove) {

        if (rootRemove.leftChild != null) {
            countRemoveEntrys++;
            countRemoveEntry(rootRemove.leftChild);

        }
        if (rootRemove.rightChild != null) {
            countRemoveEntrys++;
            countRemoveEntry(rootRemove.rightChild);
        }
    }

    private void findEntry(Entry<String> entry, String s) {
        String name = entry.elementName;
        if (name.equals(s)) {
            rootFound = entry;
            return;
        }
        if (rootFound == null && entry.leftChild != null) {
            findEntry(entry.leftChild, s);
        }
        if (entry.rightChild != null && rootFound == null) {
            findEntry(entry.rightChild, s);
        }
    }

    public String getParent(String s) {
        rootFound = null;
        findEntry(root, s);
        if (rootFound != (null)) return rootFound.parent.elementName;
        else return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
   //     return super.subList(fromIndex, toIndex);
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        super.removeRange(fromIndex, toIndex);
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
  //      return super.addAll(index, c);
    }
}
