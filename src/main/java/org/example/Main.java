package org.example;


import lombok.*;

@Builder
@NoArgsConstructor
@Getter
@Setter
@Data
@AllArgsConstructor
class SwapTwoNumbers {
    private int c;
    private int d;

    public SwapTwoNumbers swap() {
        System.out.println("Before swapping -> c: " + c + ", d: " + d);
        int temp = c;
        c = d;
        d = temp;
        return this;
    }

    public void printValue() {
        System.out.println("After swapping -> c: " + c + ", d: " + d);
    }

    public static void main(String[] args) {
        SwapTwoNumbers swapper = SwapTwoNumbers.builder().c(10).d(20).build();
        swapper.swap().printValue();
    }
}
