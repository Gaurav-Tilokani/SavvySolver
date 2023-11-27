package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class AptitudeFunctions
{


    
    public String percentageChange(double original, double revised)
    {
        try {
            if (original == 0) {
                throw new Exception();
            }
            double res = ((revised - original) / original) * 100;
            return Double.toString(res);
        }catch (Exception e)
        {
            return "Invalid original value";
        }
    }



    
    public double degreeToPercentageCalculator(double degree)
    {
        return (degree*100)/360;
    }

    public String fractionToPercentageConverter(double a, double b)
    {
        try
        {
            if(b==0)
            {
                throw new Exception();
            }
            else
            {
                double res = (a/b)*100;
                return Double.toString(res);
            }
        }catch(Exception e)
        {
            return "Value of b cannot be zero";
        }
    }



    
    public String getCountOfDays(int[] arr)
    {
        int count = 0;
        double efficiency=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                count++;
                efficiency = efficiency + 100/arr[i];
            }
        }
        try
        {
            if(count==0)
            {
                throw new Exception();
            }
            double res = (1/efficiency)*100;
            return Double.toString(res);
        }catch (Exception e)
        {
            return "Invalid input";
        }

    }



    
    public String getNthTermAP(double startValue, double commonDifference, int n)
    {
        try {
            if (n <= 0) {
                throw new Exception();
            }
            double res = startValue + (n - 1) * commonDifference;
            return Double.toString(res);
        }catch (Exception e)
        {
            return "Invalid count input";
        }
    }



    
    public String findFirstNTermsAP(double startValue, double commonDifference, int n)
    {
        String res = Double.toString(startValue);
        try
        {
            if(n<=0)
            {
                throw new Exception();
            }
            double current = startValue;
            for(int i=0;i<n-1;i++)
            {
                current = current + commonDifference;
                res = res + "," + Double.toString(current);
            }
            return res;
        }catch(Exception e)
        {
            return "Invalid count input";
        }
    }



    
    public String findSumOfFirstNTermsAP(double startValue, double commonDifference, int n)
    {

        try
        {
            if(n<=0)
            {
                throw new Exception();
            }
            double sum = (n/2)*(2*startValue + (n-1)*commonDifference);
            String res = Double.toString(sum);
            return res;
        }catch(Exception e)
        {
            return "Invalid count input";
        }
    }




    
    public String getNthTermGP(double startValue, double commonDifference, int n)
    {
        try {
            if (n <= 0) {
                throw new Exception();
            }
            double res = startValue*Math.pow(commonDifference, n-1);
            return Double.toString(res);
        }catch (Exception e)
        {
            return "Invalid count input";
        }
    }



    
    public String findFirstNTermsGP(double startValue, double commonDifference, int n)
    {
        String res = Double.toString(startValue);
        try
        {
            if(n<=0)
            {
                throw new Exception();
            }
            double current = startValue;
            for(int i=0;i<n-1;i++)
            {
                current = current*commonDifference;
                res = res + "," + Double.toString(current);
            }
            return res;
        }catch(Exception e)
        {
            return "Invalid value of n";
        }
    }



    
    public String findSumOfFirstNTermsGP(double startValue, double commonDifference, int n)
    {

        try
        {
            if(n<=0)
            {
                throw new Exception();
            }
            double sum = startValue*(Math.pow(commonDifference, n)-1)/(commonDifference-1);
            String res = Double.toString(sum);
            return res;
        }catch(Exception e)
        {
            return "Invalid count input";
        }
    }



    
    public String simpleInterest(double principal, double rate, double time)
    {
        try {
            if (principal <= 0 || rate<=0 || time<=0) {
                throw new Exception();
            }
            double si = (principal * rate * time)/ 100;
            return Double.toString(si);
        }catch (Exception e)
        {
            return "Either principal value or rate value or time value is invalid";
        }
    }



    
    public String compoundInterest(double principal, double rate, double time)
    {
        String result;
        try {
            if (principal == 0 || rate==0 || time==0) {
                throw new Exception();
            }
            double amount = principal * (Math.pow((1 + rate/100), (time)));
            double interest = amount - principal;
            return result = "Amount is: " + amount + " Interest is: " + interest;
        }catch (Exception e)
        {
            return "Either principal value or rate value or time value is invalid";

        }
    }



    
    public String compareProfitLoss(double costPrice,double sellingPrice)
    {
        String res;
        try {
            if (costPrice <= 0 || sellingPrice<=0) {
                throw new Exception();
            }
            else if(costPrice-sellingPrice>0) {
                double loss=costPrice-sellingPrice;
                double loss_percent=(loss/costPrice)*100;
                res="loss: " + loss + ", loss percent: " +loss_percent+"%";
            }
            else if(costPrice-sellingPrice<0) {
                double gain=sellingPrice-costPrice;
                double gain_percent=(gain/costPrice)*100;
                res="profit: "+ gain +", profit percent: " +gain_percent+"%";
            }
            else {
                res="No profit, No loss";
            }
            return res;
        }
        catch (Exception e){return "Either costPrice value or sellingPrice value is invalid";}
    }




    
    public String distanceSpeedAndTime(double speed,double time)
    {
        String res;
        try {
            if (speed == 0 || time == 0) {
                throw new Exception();
            }
            double distance = speed * time;
            res= "Distance is "+distance;
            return res;
        }
        catch (Exception e)
        {
            return "Invalid input value";
        }
    }



    
    public double squareArea(double side) {
        double area = side*side;
        return area;
    }

    
    public double rectangleArea(double length, double breadth) {
        double area = length*breadth;
        return area;
    }



    
    public double circleArea(double radius) {
        double pi = 3.14;
        double area = pi*radius*radius;
        return area;
    }



    
    public double triangleArea(double breadth,double height) {
        double area = 0.5*breadth*height;
        return area;
    }



    
    public double surfaceAreaOfCube(double side) {
        double area = 6*side*side;
        return area;
    }
    public double volumeOfCube(double side) {
        double volume = side*side*side;
        return volume;
    }



    
    public double surfaceAreaOfCuboid(double length,double breadth,double height) {
        double area = 2*(length*breadth+breadth*height+height*length);
        return area;
    }
    
    
    
    
    public double volumeOfCuboid(double length,double breadth,double height) {
        double volume = length*breadth*height;
        return volume;
    }



    
    public double surfaceAreaOfCylinder(double radius,double height) {
        double pi = 3.14;
        double area = 2*pi*radius*(radius+height);
        return area;
    }


    
    public double volumeOfCylinder(double radius,double height) {
        double pi = 3.14;
        double volume = pi*radius*radius*height;
        return volume;
    }



    
    public double surfaceAreaOfCone(double radius,double length) {
        double pi = 3.14;
        double area = pi*radius*(radius+length);
        return area;
    }
    
    
    
    public double volumeOfCone(double radius, double height) {
        double pi = 3.14;
        double volume = 1/3*pi*radius*radius*height;
        return volume;
    }


    
    public double surfaceAreaOfSphere(double radius) {
        double pi = 3.14;
        double area = 4*pi*radius*radius;
        return area;
    }
    
    
    
    public double volumeOfSphere(double radius) {
        double pi = 3.14;
        double volume = 4/3*pi*radius*radius*radius;
        return volume;
    }


    
    public int getMedian(int ar1[], int ar2[],
                         int n, int m)
    {

        // Current index of input array ar1[]
        int i = 0;

        // Current index of input array ar2[]
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;

        // Since there are (n+m) elements,
        // There are following two cases
        // if n+m is odd then the middle
        //index is median i.e. (m+n)/2
        if ((m + n) % 2 == 1)
        {
            for(count = 0;
                count <= (n + m) / 2;
                count++)
            {
                if (i != n && j != m)
                {
                    m1 = (ar1[i] > ar2[j]) ?
                            ar2[j++] : ar1[i++];
                }
                else if (i < n)
                {
                    m1 = ar1[i++];
                }

                // for case when j<m,
                else
                {
                    m1 = ar2[j++];
                }
            }
            return m1;
        }

        // median will be average of elements
        // at index ((m+n)/2 - 1) and (m+n)/2
        // in the array obtained after merging
        // ar1 and ar2
        else
        {
            for(count = 0;
                count <= (n + m) / 2;
                count++)
            {
                m2 = m1;
                if (i != n && j != m)
                {
                    m1 = (ar1[i] > ar2[j]) ?
                            ar2[j++] : ar1[i++];
                }
                else if (i < n)
                {
                    m1 = ar1[i++];
                }

                // for case when j<m,
                else
                {
                    m1 = ar2[j++];
                }
            }
            return (m1 + m2) / 2;
        }
    }




    public int getInvCount(ArrayList<Integer> arr, int n)
    {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }





    public boolean Anagram(String s1, String s2)
    {
        char str1[] = s1.toCharArray();
        char str2[] = s2.toCharArray();
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }




    public boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }




    public void printOdd(ArrayList<Integer> a)
    {
        System.out.println("Odd Numbers:");
        for(int i=0;i<a.size();i++){
            if(a.get(i)%2!=0){
                System.out.println(a.get(i));
            }
        }
    }





    public void printEven(ArrayList<Integer> a)
    {
        System.out.println("Even Numbers:");
        for(int i=0;i<a.size();i++){
            if(a.get(i)%2==0){
                System.out.println(a.get(i));
            }
        }
    }




    public int sumArray(ArrayList<Integer> arr)
    {
        int sum = 0; // initialize sum
        int i;

        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.size(); i++)
            sum += arr.get(i);

        return sum;
    }







    static int nextPowerOf2(int n)
    {
        int count = 0;

        // First n in the below
        // condition is for the
        // case where n is 0
        if (n > 0 && (n & (n - 1)) == 0)
            return n;

        while(n != 0)
        {
            n >>= 1;
            count += 1;
        }

        return 1 << count;
    }



    static int leftRotate(int n, int d) {

        /* In n<<d, last d bits are 0.
           To put first 3 bits of n at
           last, do bitwise or of n<<d with
           n >>(INT_BITS - d) */
        return (n << d) | (n >> (32 - d));
    }

    /*Function to right rotate n by d bits*/
    static int rightRotate(int n, int d) {

        /* In n>>d, first d bits are 0.
           To put last 3 bits of at
           first, do bitwise or of n>>d
           with n <<(INT_BITS - d) */
        return (n >> d) | (n << (32 - d));
    }

    ArrayList<Integer> SelectionSort(ArrayList<Integer> arr)
    {
        int n = arr.size();

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr.get(j) < arr.get(min_idx))
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr.get(min_idx);
            arr.set(min_idx,arr.get(i));
            arr.set(i,temp);
        }

        for (int i=0; i<n; ++i)
            System.out.print(arr.get(i)+" ");
        System.out.println();
        return arr;
    }



    ArrayList<Integer> BubbleSort(ArrayList <Integer> arr)
    {
        int n = arr.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr.get(j) > arr.get(j+1))
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
        for (int i=0; i<n; ++i)
            System.out.print(arr.get(i)+" ");
        System.out.println();
        return arr;
    }


    ArrayList<Integer> Insertionsort(ArrayList<Integer> arr)
    {
        int n = arr.size();
        for (int i = 1; i < n; ++i)
        {
            int key = arr.get(i);
            int j = i - 1;

        /* Move elements of arr[0..i-1], that are
           greater than key, to one position ahead
           of their current position */
            while (j >= 0 && arr.get(j) > key)
            {
                arr.set(j + 1,arr.get(j)) ;
                j = j - 1;
            }
            arr.set(j + 1,key);
        }


        for (int i=0; i<n; ++i)
            System.out.print(arr.get(i)+" ");
        System.out.println();
        return arr;
    }


    public int linearSearch(ArrayList<Integer> arr, int key) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == key) {
                return i;
            }
        }
        return -1;
    }
    public int binarySearch(ArrayList<Integer> arr, int x)
    {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr.get(m) == x)
                return m;

            // If x greater, ignore left half
            if (arr.get(m) < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was not present
        return -1;
    }

    public boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }


// Count total set bits in all numbers from 1 to n

    static int countSetBits(int n)
    {

        // write test case for this
        int i = 0;

        // ans store sum of set bits from 0 to n
        int ans = 0;

        // while n greater than equal to 2^i
        while ((1 << i) <= n) {

            // This k will get flipped after
            // 2^i iterations
            boolean k = false;

            // change is iterator from 2^i to 1
            int change = 1 << i;

            // This will loop from 0 to n for
            // every bit position
            for (int j = 0; j <= n; j++) {

                if (k == true)
                    ans += 1;
                else
                    ans += 0;

                if (change == 1) {

                    // When change = 1 flip the bit
                    k = !k;

                    // again set change to 2^i
                    change = 1 << i;
                }
                else {
                    change--;
                }
            }

            // increment the position
            i++;
        }

        return ans;

    }


    static int isPowerOfFour(int n)
    {
        int count = 0;

        /*Check if there is
        only one bit set in n*/
        int x = n & (n - 1);

        if ( n > 0 && x == 0)
        {
            /* count 0 bits
            before set bit */
            while(n > 1)
            {
                n >>= 1;
                count += 1;
            }

            /*If count is even
            then return true
            else false*/
            return (count % 2 == 0) ? 1 : 0;
        }

            /* If there are more than
            1 bit set then n is not a
            power of 4*/
        return 0;
    }
    
}
