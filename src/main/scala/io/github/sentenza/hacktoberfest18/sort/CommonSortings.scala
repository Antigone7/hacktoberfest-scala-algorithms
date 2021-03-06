package io.github.sentenza.hacktoberfest18.sort

/*
 * HacktoberFest 2018 - Scala Algorhitms
 * Copyright (C) 2018 sentenza
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

object CommonSortings {
  trait CommonSorting {
    def bubbleSort(array: Array[Int]): Array[Int]
    def selectionSort(array: Array[Int]): Array[Int]
    def insertionSort(array: Array[Int]): Array[Int]
    def quickSort(array: Array[Int]): Array[Int]
    def mergeSort(array: Array[Int]): Array[Int]
  }

  object CommonSorting {
    def bubbleSort(array: Array[Int]): Array[Int] = {
      var a = new ArrayBuffer[Int]
      for(i<- 0 to array.length-1; j <- i to array.length-1){
        if(array(j) > array(j-1)){
          val temp = a(j)
          a(j) = a(j-1)
          a(j-1) = temp
        }
      }
     a.toArray
    }
    def selectionSort(array: Array[Int]): Array[Int] = ???
    def insertionSort(array: Array[Int]): Array[Int] = ???
    def quickSort(array: Array[Int]): Array[Int] = ???
    def mergeSort(array: Array[Int]): Array[Int] = ???
  }
}

