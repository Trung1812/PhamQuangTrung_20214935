package hust.soict.dsai.lab1.Array;

import java.io.*;
import javax.swing.JOptionPane;

public class Array {

	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high)
	{

		int pivot = arr[high];

		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	static void quickSort(int[] arr, int low, int high)
	{
		if (low < high) {

			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	// Function to print an array
	static void printArray(int[] arr, int size)
	{
		String str = "";
		for (int i = 0; i < size; i++)
			str = str + " " + arr[i];
		JOptionPane.showMessageDialog(null, "Your sorted array is: " + str);
	}
	
	static int Sum(int[] arr, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}
		return sum;
	}
	static double Average(int[] arr, int size) {
		int sum = Sum(arr, size);
		double average = (double)sum/size;
		return average;
		
	}
	

}



