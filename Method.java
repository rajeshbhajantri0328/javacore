public class Method {
    public static void main(String[] args) {
        integers();
        chars();
         bytes();
        floats();
        longs();
    }

    public static void integers() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("integers");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
    }

    public static void chars() {
        char[] myNameCharecters = {'r','a','j'};
        System.out.println("chars");
        for (int i = 0; i <myNameCharecters.length; i++) {
            System.out.println(myNameCharecters[i]);
        }
        
    }

    public static void  bytes() {
       byte [] tenTables = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("bytes");
        for (int i = 0; i <  tenTables.length; i++) {
            System.out.println( tenTables[i]);
        }
        
    }

    public static void floats() {
        float[] roomTemperature = {24.5f, 26.5f, 23.7f, 28.3f, 20.2f};
        System.out.println("floats");
        for (int i = 0; i <roomTemperature.length; i++) {
            System.out.println(roomTemperature[i]);
        }
       
    }

    public static void longs() {
        long [] areaInSqKm = {765489L,98765L,92345L,987621L};
        System.out.println("longs");
        for (int i = 0; i <  areaInSqKm.length; i++) {
            System.out.println( areaInSqKm[i]);
        }
        
    }
}