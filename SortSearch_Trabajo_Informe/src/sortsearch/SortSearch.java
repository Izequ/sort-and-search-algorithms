/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortsearch;

/**
 *
 * @author FREDDY
 */
public class SortSearch {

    public void ordenarAs(long a[]) {
        int tmp = 0, r = 0, s = 0;  //3
        do {
            s = r + 1;  //2
            while (s < a.length) {  //1
                if (a[s] < a[r]) {  //1
                    tmp = (int) a[s]; //1
                    a[s] = a[r];    //1
                    a[r] = tmp; //1
                }
                s++;    //1
            }
            r = r + 1;  //2
        } while (r < a.length - 1); //2
    }
    
    public void ordenarPar(long a[]) {
        int tmp = 0, r = 0, s = 0;  //3
        do {
            s = r + 1;  //2
            while (s < a.length/2) {  //1
                if (a[s] < a[r]) {  //1
                    tmp = (int) a[s]; //1
                    a[s] = a[r];    //1
                    a[r] = tmp; //1
                }
                s++;    //1
            }
            r = r + 1;  //2
        } while (r < a.length - 1); //2
    }
    
    public void ordenarDes(long a[]) {
        int tmp = 0, r = 0, s = 0;  //3
        do {
            s = r + 1;  //2
            while (s < a.length) {  //1
                if (a[s] > a[r]) {  //1
                    tmp = (int) a[s]; //1
                    a[s] = a[r];    //1
                    a[r] = tmp; //1
                }
                s++;    //1
            }
            r = r + 1;  //2
        } while (r < a.length - 1); //2
    }
    
    public static void main(String[] args) {

        SortSearch test = new SortSearch();        
        long[] nums = { 88089, 99047, 19051, 44279, 55216, 73089, 61272, 14384, 25717, 44310, 62299, 79795, 96965, 20223, 92206, 60806, 38579, 82819, 93536, 80612, 51919, 58729, 80818, 75133, 85539, 96798, 38830, 80179, 74125, 22479, 26375, 96362, 23218, 24873, 90996, 38694, 77146, 21446, 74079, 52215, 12926, 97521, 65076, 37200, 38688, 22485, 88208, 67472, 81119, 92316, 44942, 63215, 22837, 78520, 70777, 15268, 57184, 16845, 85431, 91373, 74956, 25264, 11383, 16071, 54819, 59619, 86930, 15048, 76760, 97046, 26377, 11576, 65829, 11854, 81816, 87445, 31638, 65873, 48053, 73233, 47596, 95459, 24675, 33132, 12727, 20314, 57003, 67651, 18025, 25087, 90711, 53484, 18808, 73304, 73302, 23581, 54268, 84603, 79254, 42027};

        for (int i = 0; i < nums.length; i++) {
            long n = (long) (Math.random() * (99999 - 9999)) + 9999;
            nums[i] = n;
        }
        
        /*
        System.out.println("Array de numeros ");      
        System.out.print("int arr[] = { ");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]+", ");
        }
        System.out.print("};");
        
        
        System.out.println("Array de numeros Ascendente: ");
        test.ordenarAs(nums);        
        System.out.print("int arr[] = { ");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]+", ");
        }
        System.out.print("};");

        System.out.println("Array de numeros Descendente: ");
        test.ordenarDes(nums);        
        System.out.print("int arr[] = { ");
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]+", ");
        }
        System.out.print("};");
*/
        
        System.out.println("Array de numeros Parcialmente ordenado: ");
        test.ordenarPar(nums);        
        System.out.print("int arr[] = { ");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]+", ");
        }
        System.out.print("};");
    }
}
