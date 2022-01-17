/**
 * Custom array (integer)
 *
 * @author LiLittleCat
 */
public class MyArray {
    /**
     * the array tha really hold elements
     */
    private int[] array;
    /**
     * the size of elements in this array
     */
    private int size;

    /**
     * constructor
     *
     * @param capacity original capacity
     */
    public MyArray(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    /**
     * insert another element into specific position
     *
     * @param element another element to insert
     * @param index   specific index position
     */
    public void insert(int element, int index) {
        // judge the index is out of bounds or not
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("the index is out of bounds");
        }
        // judge if array's capacity needs to be expanded
        if (size >= array.length) {
            resize();
        }
        // loop from right to left, move every element 1 position to right
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        // insert the new element into the empty position
        array[index] = element;
        size++;
    }

    /**
     * expand the capacity of the array
     */
    public void resize() {
        int[] newArray = new int[array.length * 2];
        // copy elements from old array to the new one
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    /**
     * delete element from array on specific position and return the deleted element
     *
     * @param index index to be delete
     * @return the deletes element
     * @throws Exception IndexOutOfBoundsException
     */
    public int delete(int index) throws Exception {
        // judge the index is out of bounds or not
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("the index is out of bounds");
        }
        int deletedElement = array[index];
        // loop from left to right from, move every element 1 position to left
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return deletedElement;
    }

    /**
     * output the array use System.out.println
     */
    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray(4);
        myArray.insert(1, 0);
        myArray.insert(2, 1);
        myArray.insert(3, 2);
        myArray.insert(4, 3);
        myArray.insert(5, 1);
        myArray.output();
        System.out.println("length:" + myArray.array.length);
        System.out.println("size:" + myArray.size);
    }

}