/*
 * MIT License
 *
 * Copyright (c) 2020 Ivan Valentinov Bozhanin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.company;

public class Main {

    public static void main(String[] args) {
        MyInteger m1 = new MyInteger(12);
        System.out.println(m1.equals(12));
        System.out.println(m1.equals(new MyInteger(12)));
        System.out.println(MyInteger.parseInt("213451"));
        System.out.println(MyInteger.parseInt("12415".toCharArray()));
        System.out.println(m1.isEven());
        System.out.println(m1.isOdd());
        System.out.println(m1.isPrime());
        m1 = new MyInteger(13);
        System.out.println("Changed value to 13.");
        System.out.println(m1.isEven());
        System.out.println(m1.isOdd());
        System.out.println(m1.isPrime());
    }
}
