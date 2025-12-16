void main() {
    IO.println("Find Max");
    int a = 10;
    int b = 5;
    int c = 2;
    int max = 0;

    if(a>b && a>c){
        max = a;
    }else if(b>c && b>a){
        max = b;
    }else if(c>a && c>b) {
        max = c;
    }else {
        IO.println("Not Process");
    }
    IO.print("Max : " + max);
}
