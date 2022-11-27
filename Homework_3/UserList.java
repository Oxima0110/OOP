package Homework_3;

import java.util.Iterator;

public class UserList<T> implements Iterable<T>{

    static class UserName {
        String name;

        public UserName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return String.format("%s", getName());
        }    
    }

    static class UserNumber {
        Integer number;

        public UserNumber(Integer number) {
            this.number = number;
        }

        public Integer getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return String.format("%d", getNumber());
        }    
    }



    UserInfo<T> head;
    UserInfo<T> tail;
    
    private class UserInfo<T> {
        T data;
        UserInfo<T> next;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(T item) {
        UserInfo<T> userInfo = new UserInfo<>();
        userInfo.data = item;
        if (isEmpty()) {
            head = userInfo;
            tail = userInfo;
        } else {
            tail.next = userInfo;
            tail = userInfo;
        }
    }

    @Override
    public Iterator<T> iterator() {
        
        return new Iterator<T>() {
            UserInfo<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }
            
            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}
