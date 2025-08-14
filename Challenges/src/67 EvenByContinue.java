class EvenByContinue {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
