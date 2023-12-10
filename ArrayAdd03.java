import java.util.Scanner;

	public class ArrayAdd03 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] array = {1, 2, 3};

	        while (true) {
	            // 打印当前数组
	            System.out.println("当前数组：");
	            printArray(array);

	            // 提示用户是否继续添加
	            System.out.println("是否继续添加？ (是/否)");
	            String choice = scanner.next();

	            if (choice.equalsIgnoreCase("是")) {
	                // 添加元素
	                array = addElement(array, scanner);
	            } else if (choice.equalsIgnoreCase("否")) {
	                // 退出添加
	                break;
	            } else {
	                // 输入有误，重新输入
	                System.out.println("输入有误，请重新输入。");
	            }
	        }

	        System.out.println("你退出了添加");

	        scanner.close();
	    }

	    // 添加元素到数组
	    private static int[] addElement(int[] arr, Scanner scanner) {
	        System.out.println("请输入添加的元素值：");
	        int newValue;

	        while (true) {
	            if (scanner.hasNextInt()) {
	                newValue = scanner.nextInt();
	                break;
	            } else {
	                System.out.println("输入有误，请重新输入。");
	                scanner.next(); // 清空输入缓冲区
	            }
	        }

	        // 扩容数组
	        int[] newArr = new int[arr.length + 1];
	        System.arraycopy(arr, 0, newArr, 0, arr.length);
	        newArr[arr.length] = newValue;

	        System.out.println("添加后的数组：");
	        printArray(newArr);

	        return newArr;
	    }

	    // 打印数组
	    private static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}
	
	
	

