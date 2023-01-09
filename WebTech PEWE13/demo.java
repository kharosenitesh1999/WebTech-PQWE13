import java.io.*;

class Ascend {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of Array:");

                int n = Integer.parseInt(br.readLine());
                String[] sarr = new String[n];

                for(int i=0;i<n;i++) {

                        sarr[i] = br.read().charAt(0);
                }

                for(int i=0;i<n-1;i++) {

                        for(int j=0;j<n-1-i;j++) {

                                if(sarr[j].charAt(0) > sarr[j+1].charAt(0) ){
                                        String temp = sarr[j];
                                        sarr[j] = sarr[j+1];
                                        sarr[j+1] = temp;
                                }
                                System.out.println("Array After Sorting:"+ sarr[j].charAt(0));
                        }
                }
        }
}