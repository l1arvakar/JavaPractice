package by.bsuir;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TasksTest {
    @Test
    @DisplayName("task 1 should return 1.5 for x = 1 y = -1")
    public void task1Test() {
        double actual = Tasks.findSolution(1, -1);
        Assertions.assertEquals(1.5, actual, 1e-6);
    }

    @Test
    @DisplayName("task 2 should return true for x = 4 y = 0")
    public void task2Test() {
        boolean actual = Tasks.isPointBelongsArea(4, 0);
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("task 4 should return [0, 2, 4] for array = [3, 4, 7, 9, 13]")
    public void task4Test() {
        int[] array = new int[]{3, 4, 7, 9, 13};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,2,4));
        ArrayList<Integer> actual = Tasks.findPrimeElements(array);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    @DisplayName("task 5 should return 3 for array = [3, 16, 7, 8, 2, 1]")
    public void task5Test() {
        int[] array = new int[]{3, 16, 7, 8, 2, 1};
        int actual = Tasks.findMinimumDeletion(array);
        Assertions.assertEquals(3, actual);
    }

    @Test
    @DisplayName("task 6 should return [[1, 2, 3, 4, 5], [2, 3, 4, 5, 1], [3, 4, 5, 1, 2], [4, 5, 1, 2, 3], [5, 1, 2, 3, 4]] for array = [1, 2, 3, 4, 5]")
    public void task6Test() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[][] expected = new int[][] {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 1}, {3, 4, 5, 1, 2}, {4, 5, 1, 2, 3}, {5, 1, 2, 3, 4}};
        int[][] actual = Tasks.createMatrix(array);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("task 7 should return [1, 2, 3, 4, 10] for array = [4, 1, 10, 2, 3]")
    public void task7Test() {
        int[] array = new int[]{4, 1, 10, 2, 3};
        int[] expected = new int[]{1, 2, 3, 4, 10};
        int[] actual = Tasks.arrraySort(array);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("task 8 should return [0, 0, 2, 3] for sequences [2, 4, 6] and [1, 2, 5, 7]")
    public void task8Test() {
        ArrayList<Integer> firstSequence = new ArrayList<>() {{add(2); add(4); add(6);}};
        ArrayList<Integer> secondSequence = new ArrayList<>() {{add(1); add(2); add(5); add(7);}};
        ArrayList<Integer> expected = new ArrayList<>() {{add(0); add(0); add(2); add(3);}};
        ArrayList<Integer> actual = Tasks.findIndexesToCombineSequences(firstSequence, secondSequence);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    @DisplayName("task 9 should return weight = 5 for three balls with weights 1, 2, 2")
    public void task9WeightTest() {
        Ball firstBall = new Ball(1, Ball.BallColor.BLACK);
        Ball secondBall = new Ball(2, Ball.BallColor.BLUE);
        Ball thirdBall = new Ball(2, Ball.BallColor.BLUE);
        Basket basket = new Basket();
        basket.addBall(firstBall);
        basket.addBall(secondBall);
        basket.addBall(thirdBall);
        int actual = basket.findWeight();
        Assertions.assertEquals(5, actual);
    }

    @Test
    @DisplayName("task 9 should return blue amount = 2 for three balls with colors black, blue, blue")
    public void task9Test() {
        Ball firstBall = new Ball(1, Ball.BallColor.BLACK);
        Ball secondBall = new Ball(2, Ball.BallColor.BLUE);
        Ball thirdBall = new Ball(2, Ball.BallColor.BLUE);
        Basket basket = new Basket();
        basket.addBall(firstBall);
        basket.addBall(secondBall);
        basket.addBall(thirdBall);
        int actual = basket.findAmountOfBlue();
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void  isbnSortTest() {
        Book[] books = {new Book("", "", 0, 0, 2), new Book("", "", 0, 0, 3), new Book("", "", 0, 0, 1)};
        Book[] expected = {new Book("", "", 0, 0, 2), new Book("", "", 0, 0, 3), new Book("", "", 0, 0, 1)};
        Arrays.sort(books);
        Assertions.assertArrayEquals(expected, books);
    }

    @Test
    public void  titleSortTest() {
        Book[] books = {new Book("b", "", 0, 0, 2), new Book("a", "", 0, 0, 3), new Book("c", "", 0, 0, 1)};
        Book[] expected = {new Book("a", "", 0, 0, 2), new Book("b", "", 0, 0, 3), new Book("c", "", 0, 0, 1)};
        Arrays.sort(books, new BookComparator.TitleComparator());
        Assertions.assertArrayEquals(expected, books);
    }

    @Test
    public void  titleAuthorSortTest() {
        Book[] books = {new Book("b", "", 0, 0, 2), new Book("a", "a", 0, 0, 3), new Book("a", "b", 0, 0, 1)};
        Book[] expected = {new Book("a", "a", 0, 0, 2), new Book("a", "b", 0, 0, 3), new Book("b", "", 0, 0, 1)};
        Arrays.sort(books, new BookComparator.TitleAuthorComparator());
        Assertions.assertArrayEquals(expected, books);
    }

    @Test
    public void  authorTitleSortTest() {
        Book[] books = {new Book("a", "b", 0, 0, 2), new Book("a", "a", 0, 0, 3), new Book("b", "a", 0, 0, 1)};
        Book[] expected = {new Book("a", "a", 0, 0, 2), new Book("b", "a", 0, 0, 3), new Book("a", "b", 0, 0, 1)};
        Arrays.sort(books, new BookComparator.AuthorTitleComparator());
        Assertions.assertArrayEquals(expected, books);
    }

    @Test
    public void  authorTitlePriceSortTest() {
        Book[] books = {new Book("a", "a", 2, 0, 2), new Book("a", "a", 1, 0, 3), new Book("b", "a", 0, 0, 1)};
        Book[] expected = {new Book("a", "a", 1, 0, 2), new Book("a", "a", 2, 0, 3), new Book("b", "a", 0, 0, 1)};
        Arrays.sort(books, new BookComparator.AuthorTitlePriceComparator());
        Assertions.assertArrayEquals(expected, books);
    }
}
