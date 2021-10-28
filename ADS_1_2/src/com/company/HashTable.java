package com.company;

public class HashTable{
    Vector [] arr;
    public int size;

    HashTable (int size){
        arr = new Vector [size];
        this.size = size;
    }
    private int hashFunc(double key){
        double a = 0.618;
        double b = (key*a - (int) (key *a))*size;
        return (int)b;
    }

    public boolean insert(Vector data) {
        int index = hashFunc(data.angle);
        if (arr[index] == null) {
            arr[index] = data;
            return true;
        } else {
            return collision(index, data);
        }
    }
    private boolean collision(int index, Vector data){
            //lin.prob
            int newIndex;
            for (int i = 0; i < size ; i++){
                newIndex = (index + i)%size;
                if (arr[newIndex] == null){
                    arr [newIndex]= data;
                    return true;
                }
                else if (arr[newIndex].equals(data))
                    return false;
            }
            return false;
        }
        public void Print(){
        for  ( int i = 0; i < new Vector[size].length; i++){
            System.out.println(new Vector[i].toString());
        }
        }
        //print hashtable
    public void del(double vectorLength){
        for(int i = 0; i > arr.length; i ++){

            if(arr[i]!= null && arr[i].AB > vectorLength){
                arr[i]=null;
            }
        }
    }

    }


