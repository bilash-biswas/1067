package main

import (
	"fmt"
)

func main() {
	var a, i int
	fmt.Scan(&a)
	for i = 1; i <= a; i = i + 2 {
		fmt.Printf("%d\n", i)
	}
}
