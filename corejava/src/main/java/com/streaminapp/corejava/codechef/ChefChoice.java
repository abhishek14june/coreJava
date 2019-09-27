package com.streaminapp.corejava.codechef;


public class ChefChoice {

}

/*
 * A shopkeeper in Chefland has N N ingredients in a row his store. He is a
 * cunning and greedy fellow and thus every time Chef comes to buy something,
 * the shopkeeper offers him only a sub-segment (sub-array) of the N N
 * ingredients he has and says that the others are out of stock. Then the
 * shopkeeper imposes two extra conditions: If Chef buys an ingredient of price
 * X X , then he also has to buy all ingredients of price lesser than X X from
 * the sub-segment chef has been asked to choose from. Chef has to buy total
 * ingredients worth at least Y Y from the sub-segment in offer, or he cannot
 * buy anything at all. Formally Chef has a list of N N items where i th ith
 * item has cost A i Ai . Chef goes to the shop Q Q times and each time is
 * presented with three integers Y Y , L L and R R where L L and R R stand for
 * the sub-segment of ingredients on offer and Y Y stands for the minimum amount
 * of money he must spend. For each query help Chef find the minimum total cost
 * of ingredients he can buy or state that he cannot buy anything at all. Note
 * that all ingredients with index between L L and R R (both inclusive) are on
 * offer in a given query. It does not matter if Chef has bought some of them
 * before, the shopkeeper replenishes them. Also note that chef does NOT want to
 * minimize or maximize the number of products he buys. Input: The first line
 * contains an integer N N . The next line has N N space separated integers A 1
 * , A 2 ,....., A N A1,A2,.....,AN where A i Ai describes cost of i th ith
 * ingredient. The next line will contain an integer Q Q which is the number of
 * queries. Q Q lines will follow, each line will have 3 space separated
 * integers: L L R R Y Y L L and R R denote the subsegment on offer and Y Y
 * tells the minimum amount to be spent in that turn. Output: Output Q Q lines,
 * each line corresponding to a query. Output a single integer val val which is
 * the minimum amount chef has to spend to be able to shop. If there is no such
 * amount print −1 −1 . Constraints: 1≤N≤ 10 6 1≤N≤106 1≤Q≤2000 1≤Q≤2000 1≤ A i
 * ≤ 10 9 1≤Ai≤109 1≤L≤R≤N 1≤L≤R≤N 1≤Y≤ 10 18 1≤Y≤1018 All A i Ai s are distinct
 * i.e if i≠j i≠j then A i ≠ A j Ai≠Aj Subtasks: Subtask #1 (30 Points):
 * 1≤N≤1000 1≤N≤1000 Subtask #2 (70 Points): Original constraints Sample Input:
 * 6 3 1 8 2 4 7 3 1 4 4 2 5 7 2 6 35 Sample Output: 6 7 -1
 */
