package ejercicio5;

public class IntVector implements IntList{
    public int [] arrList;
    public int currentSize;

    public IntVector() {
        this.arrList = new int[20];
        this.currentSize = 0;
    }

    public boolean isFull(){
        return currentSize == (arrList.length - 1);
    }

    @Override
    public void add(int number) {
        //Si esta lleno, aumentar el tamaño un 50%
        if(isFull()){
            //calculo el nuevo tamaño del arreglo
            int newSize = arrList.length*2;
            //Creo arreglo con nuevo tamaño
            int [] tmpArray = new int[newSize];

            //Copio los valores del arreglo viejo al nuevo
            for(int i = 0; i < arrList.length; i++)
                tmpArray[i] = arrList[i];

            //me quedo con el nuevo arreglo redimensionado
            this.arrList = tmpArray;

        }

        //Agregamos el numero que nos estan pidiendo
        this.arrList[currentSize] = number;
        currentSize++;

    }

    @Override
    public int get(int index) {
        if(index <= arrList.length)
            return arrList[index];

        return -1;
    }
}

