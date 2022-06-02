public class Main {

    static int[] sirala(int[] dizi){
        for (int i = 0; i < dizi.length; i++) {

            for (int j = i + 1; j < dizi.length - 1; j++) {
                if (dizi[i] > dizi[j]) {
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
        return dizi;
    }

    static void printInfo(int[] dizi){
        for(int i=0;i<dizi.length;i++){
            int counter=1;
            for(int j=i+1;j<dizi.length;j++){
                if(dizi[i]==dizi[j]){
                    counter++;
                }
            }
            System.out.println(dizi[i]+" sayısı "+counter+" kere tekrar edildi");
            i=i+counter-1;
        }

    }


    public static void main(String[] args) {

        int[] dizi = new int[]{10, 20, 20, 10, 10, 20, 5, 20};

        dizi=sirala(dizi);
        printInfo(dizi);
    }
}
