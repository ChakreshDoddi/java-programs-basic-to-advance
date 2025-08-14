package in.kgcoding.genericsanddiamonds;

public class Box <T>{
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
    public void printArray(T[] arr){
        for(T elem:arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
}
