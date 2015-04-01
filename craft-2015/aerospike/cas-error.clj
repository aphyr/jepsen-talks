Not linearizable. Linearizable prefix was:
2	:invoke	:read	2
4	:invoke	:read	2
3	:invoke	:write	4
1	:invoke	:write	2
0	:invoke	:cas	[4 2]
1	:ok	:write	2
3	:ok	:write	4
4	:ok	:read	2
2	:ok	:read	2
0	:fail	:cas	[4 2]	:value-mismatch
1	:invoke	:write	4
2	:invoke	:write	1
4	:invoke	:write	1
3	:invoke	:cas	[4 1]
1	:ok	:write	4
0	:invoke	:read	1
3	:fail	:cas	[4 1]	:value-mismatch
4	:ok	:write	1
0	:ok	:read	1
2	:ok	:write	1
4	:invoke	:read	1
0	:invoke	:read	1
4	:ok	:read	1
0	:ok	:read	1
1	:invoke	:cas	[1 2]
3	:invoke	:cas	[4 4]
2	:invoke	:cas	[1 3]
3	:fail	:cas	[4 4]	:value-mismatch
2	:fail	:cas	[1 3]	:value-mismatch
1	:ok	:cas	[1 2]
4	:invoke	:cas	[1 0]
0	:invoke	:cas	[2 1]
4	:fail	:cas	[1 0]	:value-mismatch
0	:ok	:cas	[2 1]
3	:invoke	:read	1
2	:invoke	:cas	[1 3]
1	:invoke	:cas	[2 0]
3	:ok	:read	1
1	:fail	:cas	[2 0]	:value-mismatch
2	:ok	:cas	[1 3]
4	:invoke	:read	3
4	:ok	:read	3
0	:invoke	:write	2
3	:invoke	:cas	[2 0]
0	:ok	:write	2
1	:invoke	:read	0
1	:ok	:read	0
2	:invoke	:write	0
3	:ok	:cas	[2 0]
2	:ok	:write	0
4	:invoke	:write	4
4	:ok	:write	4
0	:invoke	:cas	[2 0]
0	:fail	:cas	[2 0]	:value-mismatch
1	:invoke	:write	0
3	:invoke	:cas	[0 1]
1	:ok	:write	0
2	:invoke	:cas	[4 2]
2	:fail	:cas	[4 2]	:value-mismatch
3	:ok	:cas	[0 1]
4	:invoke	:read	1
4	:ok	:read	1
0	:invoke	:cas	[4 3]
0	:fail	:cas	[4 3]	:value-mismatch
1	:invoke	:cas	[0 1]
1	:fail	:cas	[0 1]	:value-mismatch
2	:invoke	:cas	[4 3]
3	:invoke	:write	2
2	:fail	:cas	[4 3]	:value-mismatch
3	:ok	:write	2
4	:invoke	:write	3
0	:invoke	:cas	[2 4]
4	:ok	:write	3
0	:fail	:cas	[2 4]	:value-mismatch
1	:invoke	:cas	[4 0]
1	:fail	:cas	[4 0]	:value-mismatch
2	:invoke	:cas	[3 1]
3	:invoke	:cas	[0 4]
2	:ok	:cas	[3 1]
3	:fail	:cas	[0 4]	:value-mismatch
4	:invoke	:cas	[2 3]
0	:invoke	:cas	[0 0]
0	:fail	:cas	[0 0]	:value-mismatch
4	:fail	:cas	[2 3]	:value-mismatch
1	:invoke	:cas	[3 2]
1	:fail	:cas	[3 2]	:value-mismatch
2	:invoke	:cas	[2 1]
3	:invoke	:read	1
2	:fail	:cas	[2 1]	:value-mismatch
3	:ok	:read	1
0	:invoke	:read	1
4	:invoke	:read	1
0	:ok	:read	1
4	:ok	:read	1
1	:invoke	:cas	[3 0]
1	:fail	:cas	[3 0]	:value-mismatch
2	:invoke	:write	0
3	:invoke	:write	0
2	:ok	:write	0
3	:ok	:write	0
0	:invoke	:read	0
4	:invoke	:cas	[1 3]
0	:ok	:read	0
4	:fail	:cas	[1 3]	:value-mismatch
1	:invoke	:cas	[3 2]
1	:fail	:cas	[3 2]	:value-mismatch
2	:invoke	:read	0
2	:ok	:read	0
3	:invoke	:cas	[0 0]
3	:ok	:cas	[0 0]
0	:invoke	:write	0
4	:invoke	:cas	[0 0]
1	:invoke	:write	2
0	:ok	:write	0
4	:ok	:cas	[0 0]
1	:ok	:write	2
2	:invoke	:cas	[3 4]
2	:fail	:cas	[3 4]	:value-mismatch
3	:invoke	:cas	[3 0]
3	:fail	:cas	[3 0]	:value-mismatch
0	:invoke	:cas	[4 3]
0	:fail	:cas	[4 3]	:value-mismatch
4	:invoke	:cas	[4 4]
4	:fail	:cas	[4 4]	:value-mismatch
1	:invoke	:read	2
1	:ok	:read	2
2	:invoke	:read	2
2	:ok	:read	2
3	:invoke	:cas	[4 1]
3	:fail	:cas	[4 1]	:value-mismatch
0	:invoke	:cas	[2 1]
4	:invoke	:cas	[0 1]
1	:invoke	:write	4
0	:ok	:cas	[2 1]
4	:fail	:cas	[0 1]	:value-mismatch
1	:ok	:write	4
2	:invoke	:cas	[0 1]
2	:fail	:cas	[0 1]	:value-mismatch
3	:invoke	:read	4
3	:ok	:read	4
0	:invoke	:cas	[1 2]
4	:invoke	:cas	[0 3]
0	:fail	:cas	[1 2]	:value-mismatch
1	:invoke	:write	4
4	:fail	:cas	[0 3]	:value-mismatch
1	:ok	:write	4
2	:invoke	:cas	[0 0]
2	:fail	:cas	[0 0]	:value-mismatch
3	:invoke	:read	4
3	:ok	:read	4
0	:invoke	:write	4
4	:invoke	:cas	[0 1]
4	:fail	:cas	[0 1]	:value-mismatch
1	:invoke	:read	4
0	:ok	:write	4
1	:ok	:read	4
2	:invoke	:write	4
2	:ok	:write	4
3	:invoke	:write	0
3	:ok	:write	0
4	:invoke	:cas	[0 1]
0	:invoke	:read	0
1	:invoke	:cas	[1 0]
0	:ok	:read	0
4	:ok	:cas	[0 1]
2	:invoke	:write	1
1	:ok	:cas	[1 0]
2	:ok	:write	1
3	:invoke	:cas	[0 2]
3	:fail	:cas	[0 2]	:value-mismatch
0	:invoke	:read	1
0	:ok	:read	1
4	:invoke	:cas	[2 3]
4	:fail	:cas	[2 3]	:value-mismatch
1	:invoke	:cas	[0 3]
1	:fail	:cas	[0 3]	:value-mismatch
2	:invoke	:write	0
2	:ok	:write	0
3	:invoke	:write	1
3	:ok	:write	1
0	:invoke	:cas	[4 4]
4	:invoke	:cas	[1 4]
0	:fail	:cas	[4 4]	:value-mismatch
1	:invoke	:read	4
1	:ok	:read	4
4	:ok	:cas	[1 4]
2	:invoke	:cas	[4 4]
2	:ok	:cas	[4 4]
3	:invoke	:cas	[2 3]
3	:fail	:cas	[2 3]	:value-mismatch
0	:invoke	:read	4
0	:ok	:read	4
1	:invoke	:cas	[2 2]
4	:invoke	:cas	[4 0]
1	:fail	:cas	[2 2]	:value-mismatch
4	:ok	:cas	[4 0]
2	:invoke	:cas	[1 2]
2	:fail	:cas	[1 2]	:value-mismatch
3	:invoke	:write	2
3	:ok	:write	2
0	:invoke	:cas	[4 0]
0	:fail	:cas	[4 0]	:value-mismatch
1	:invoke	:write	2
1	:ok	:write	2
4	:invoke	:read	2
4	:ok	:read	2
2	:invoke	:read	2
2	:ok	:read	2
3	:invoke	:cas	[0 2]
3	:fail	:cas	[0 2]	:value-mismatch
0	:invoke	:read	2
0	:ok	:read	2
1	:invoke	:read	2
1	:ok	:read	2
4	:invoke	:read	2
4	:ok	:read	2
2	:invoke	:cas	[2 4]
2	:ok	:cas	[2 4]
3	:invoke	:cas	[2 2]
3	:fail	:cas	[2 2]	:value-mismatch
0	:invoke	:write	0
1	:invoke	:cas	[2 3]
0	:ok	:write	0
1	:fail	:cas	[2 3]	:value-mismatch
4	:invoke	:cas	[1 3]
4	:fail	:cas	[1 3]	:value-mismatch
2	:invoke	:write	0
3	:invoke	:cas	[4 0]
2	:ok	:write	0
3	:fail	:cas	[4 0]	:value-mismatch
0	:invoke	:read	0
1	:invoke	:cas	[1 2]
0	:ok	:read	0
1	:fail	:cas	[1 2]	:value-mismatch
4	:invoke	:read	0
4	:ok	:read	0
2	:invoke	:cas	[0 2]
3	:invoke	:read	2
3	:ok	:read	2
2	:ok	:cas	[0 2]
0	:invoke	:cas	[4 4]
1	:invoke	:write	1
0	:fail	:cas	[4 4]	:value-mismatch
4	:invoke	:write	4
1	:ok	:write	1
4	:ok	:write	4
3	:invoke	:read	4
2	:invoke	:read	4
3	:ok	:read	4
2	:ok	:read	4
0	:invoke	:cas	[1 0]
0	:fail	:cas	[1 0]	:value-mismatch
1	:invoke	:write	0
4	:invoke	:cas	[0 3]
1	:ok	:write	0
4	:ok	:cas	[0 3]
3	:invoke	:write	4
2	:invoke	:cas	[2 0]
2	:fail	:cas	[2 0]	:value-mismatch
3	:ok	:write	4
0	:invoke	:read	4
0	:ok	:read	4
1	:invoke	:read	4
1	:ok	:read	4
4	:invoke	:cas	[2 1]
4	:fail	:cas	[2 1]	:value-mismatch
2	:invoke	:read	4
3	:invoke	:read	4
2	:ok	:read	4
3	:ok	:read	4
0	:invoke	:write	3
1	:invoke	:read	3
0	:ok	:write	3
1	:ok	:read	3
4	:invoke	:cas	[4 3]
4	:fail	:cas	[4 3]	:value-mismatch
2	:invoke	:cas	[0 4]
3	:invoke	:read	3
2	:fail	:cas	[0 4]	:value-mismatch
3	:ok	:read	3
0	:invoke	:read	3
1	:invoke	:cas	[4 4]
0	:ok	:read	3
1	:fail	:cas	[4 4]	:value-mismatch
4	:invoke	:cas	[2 2]
4	:fail	:cas	[2 2]	:value-mismatch
3	:invoke	:write	3
2	:invoke	:write	2
2	:ok	:write	2
3	:ok	:write	3
:nemesis	:info	:stop	nil
0	:invoke	:write	0
1	:invoke	:cas	[4 1]
1	:fail	:cas	[4 1]	:value-mismatch
0	:ok	:write	0
4	:invoke	:cas	[4 2]
4	:fail	:cas	[4 2]	:value-mismatch
2	:invoke	:read	0
2	:ok	:read	0
3	:invoke	:cas	[0 4]
3	:ok	:cas	[0 4]
1	:invoke	:cas	[1 1]
0	:invoke	:write	1
1	:fail	:cas	[1 1]	:value-mismatch
0	:ok	:write	1
4	:invoke	:cas	[2 3]
4	:fail	:cas	[2 3]	:value-mismatch
2	:invoke	:cas	[4 0]
2	:fail	:cas	[4 0]	:value-mismatch
3	:invoke	:write	2
3	:ok	:write	2
:nemesis	:info	:stop	"fully connected"
:nemesis	:info	:start	nil
1	:invoke	:write	1
0	:invoke	:cas	[0 0]
0	:fail	:cas	[0 0]	:value-mismatch
1	:ok	:write	1
4	:invoke	:cas	[2 2]
4	:fail	:cas	[2 2]	:value-mismatch
2	:invoke	:cas	[1 4]
2	:ok	:cas	[1 4]
3	:invoke	:write	1
3	:ok	:write	1
0	:invoke	:write	0
1	:invoke	:cas	[1 2]
4	:invoke	:cas	[2 3]
4	:fail	:cas	[2 3]	:value-mismatch
2	:invoke	:cas	[0 1]
3	:invoke	:cas	[0 4]
0	:info	:write	0	:timeout
1	:info	:cas	[1 2]	:timeout
2	:info	:cas	[0 1]	:timeout
:nemesis	:info	:start	"Cut off {:n1 #{:n3 :n5}, :n2 #{:n3 :n5}, :n4 #{:n3 :n5}, :n5 #{:n4 :n2 :n1}, :n3 #{:n4 :n2 :n1}}"
3	:info	:cas	[0 4]	:timeout
4	:invoke	:read	0
4	:ok	:read	0
5	:invoke	:write	4
6	:invoke	:write	2
7	:invoke	:write	4
8	:invoke	:read	2
8	:ok	:read	2
6	:info	:write	2	:timeout
5	:info	:write	4	:timeout
7	:info	:write	4	:timeout
4	:invoke	:cas	[4 1]
4	:fail	:cas	[4 1]	:value-mismatch
8	:invoke	:cas	[3 4]
8	:fail	:cas	[3 4]	:value-mismatch
11	:invoke	:write	0
10	:invoke	:cas	[3 4]
10	:fail	:cas	[3 4]	:value-mismatch
11	:ok	:write	0
12	:invoke	:read	0
12	:ok	:read	0
4	:invoke	:read	2
4	:ok	:read	2
8	:invoke	:cas	[1 1]
8	:fail	:cas	[1 1]	:value-mismatch
10	:invoke	:write	4
11	:invoke	:cas	[3 3]
11	:fail	:cas	[3 3]	:value-mismatch
10	:ok	:write	4
12	:invoke	:cas	[0 3]

Followed by inconsistent operation:
12	:ok	:cas	[0 3]

-------------------------------------------------------------
Just prior to that operation, possible interpretations of the
linearizable prefix were:
World with fixed history:
3	:invoke	:write	4
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
1	:invoke	:write	4
4	:invoke	:write	1
2	:invoke	:write	1
0	:invoke	:read	1
4	:invoke	:read	1
0	:invoke	:read	1
1	:invoke	:cas	[1 2]
0	:invoke	:cas	[2 1]
3	:invoke	:read	1
2	:invoke	:cas	[1 3]
4	:invoke	:read	3
0	:invoke	:write	2
3	:invoke	:cas	[2 0]
1	:invoke	:read	0
2	:invoke	:write	0
4	:invoke	:write	4
1	:invoke	:write	0
3	:invoke	:cas	[0 1]
4	:invoke	:read	1
3	:invoke	:write	2
4	:invoke	:write	3
2	:invoke	:cas	[3 1]
3	:invoke	:read	1
0	:invoke	:read	1
4	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	0
0	:invoke	:read	0
2	:invoke	:read	0
3	:invoke	:cas	[0 0]
4	:invoke	:cas	[0 0]
0	:invoke	:write	0
1	:invoke	:write	2
1	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:cas	[2 1]
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:read	4
0	:invoke	:write	4
2	:invoke	:write	4
3	:invoke	:write	0
4	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 0]
0	:invoke	:read	0
2	:invoke	:write	1
0	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	1
4	:invoke	:cas	[1 4]
1	:invoke	:read	4
2	:invoke	:cas	[4 4]
0	:invoke	:read	4
4	:invoke	:cas	[4 0]
3	:invoke	:write	2
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:read	2
1	:invoke	:read	2
4	:invoke	:read	2
2	:invoke	:cas	[2 4]
0	:invoke	:write	0
2	:invoke	:write	0
0	:invoke	:read	0
4	:invoke	:read	0
2	:invoke	:cas	[0 2]
3	:invoke	:read	2
1	:invoke	:write	1
4	:invoke	:write	4
3	:invoke	:read	4
2	:invoke	:read	4
1	:invoke	:write	0
4	:invoke	:cas	[0 3]
3	:invoke	:write	4
0	:invoke	:read	4
1	:invoke	:read	4
2	:invoke	:read	4
3	:invoke	:read	4
0	:invoke	:write	3
1	:invoke	:read	3
3	:invoke	:read	3
0	:invoke	:read	3
3	:invoke	:write	3
2	:invoke	:write	2
0	:invoke	:write	0
2	:invoke	:read	0
3	:invoke	:cas	[0 4]
0	:invoke	:write	1
3	:invoke	:write	2
1	:invoke	:write	1
2	:invoke	:cas	[1 4]
3	:invoke	:write	1
0	:invoke	:write	0
4	:invoke	:read	0
2	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 2]
8	:invoke	:read	2
11	:invoke	:write	0
12	:invoke	:read	0
3	:invoke	:cas	[0 4]
6	:invoke	:write	2
4	:invoke	:read	2
10	:invoke	:write	4

led to state: 
{:value 4}

with pending operations:
5	:invoke	:write	4
7	:invoke	:write	4
12	:invoke	:cas	[0 3]

World with fixed history:
3	:invoke	:write	4
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
1	:invoke	:write	4
4	:invoke	:write	1
2	:invoke	:write	1
0	:invoke	:read	1
4	:invoke	:read	1
0	:invoke	:read	1
1	:invoke	:cas	[1 2]
0	:invoke	:cas	[2 1]
3	:invoke	:read	1
2	:invoke	:cas	[1 3]
4	:invoke	:read	3
0	:invoke	:write	2
3	:invoke	:cas	[2 0]
1	:invoke	:read	0
2	:invoke	:write	0
4	:invoke	:write	4
1	:invoke	:write	0
3	:invoke	:cas	[0 1]
4	:invoke	:read	1
3	:invoke	:write	2
4	:invoke	:write	3
2	:invoke	:cas	[3 1]
3	:invoke	:read	1
0	:invoke	:read	1
4	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	0
0	:invoke	:read	0
2	:invoke	:read	0
3	:invoke	:cas	[0 0]
4	:invoke	:cas	[0 0]
0	:invoke	:write	0
1	:invoke	:write	2
1	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:cas	[2 1]
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:read	4
0	:invoke	:write	4
2	:invoke	:write	4
3	:invoke	:write	0
4	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 0]
0	:invoke	:read	0
2	:invoke	:write	1
0	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	1
4	:invoke	:cas	[1 4]
1	:invoke	:read	4
2	:invoke	:cas	[4 4]
0	:invoke	:read	4
4	:invoke	:cas	[4 0]
3	:invoke	:write	2
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:read	2
1	:invoke	:read	2
4	:invoke	:read	2
2	:invoke	:cas	[2 4]
0	:invoke	:write	0
2	:invoke	:write	0
0	:invoke	:read	0
4	:invoke	:read	0
2	:invoke	:cas	[0 2]
3	:invoke	:read	2
1	:invoke	:write	1
4	:invoke	:write	4
3	:invoke	:read	4
2	:invoke	:read	4
1	:invoke	:write	0
4	:invoke	:cas	[0 3]
3	:invoke	:write	4
0	:invoke	:read	4
1	:invoke	:read	4
2	:invoke	:read	4
3	:invoke	:read	4
0	:invoke	:write	3
1	:invoke	:read	3
3	:invoke	:read	3
0	:invoke	:read	3
3	:invoke	:write	3
2	:invoke	:write	2
0	:invoke	:write	0
2	:invoke	:read	0
3	:invoke	:cas	[0 4]
0	:invoke	:write	1
3	:invoke	:write	2
1	:invoke	:write	1
2	:invoke	:cas	[1 4]
3	:invoke	:write	1
0	:invoke	:write	0
4	:invoke	:read	0
2	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 2]
8	:invoke	:read	2
11	:invoke	:write	0
12	:invoke	:read	0
3	:invoke	:cas	[0 4]
6	:invoke	:write	2
4	:invoke	:read	2
10	:invoke	:write	4
5	:invoke	:write	4

led to state: 
{:value 4}

with pending operations:
7	:invoke	:write	4
12	:invoke	:cas	[0 3]

World with fixed history:
3	:invoke	:write	4
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
1	:invoke	:write	4
4	:invoke	:write	1
2	:invoke	:write	1
0	:invoke	:read	1
4	:invoke	:read	1
0	:invoke	:read	1
1	:invoke	:cas	[1 2]
0	:invoke	:cas	[2 1]
3	:invoke	:read	1
2	:invoke	:cas	[1 3]
4	:invoke	:read	3
0	:invoke	:write	2
3	:invoke	:cas	[2 0]
1	:invoke	:read	0
2	:invoke	:write	0
4	:invoke	:write	4
1	:invoke	:write	0
3	:invoke	:cas	[0 1]
4	:invoke	:read	1
3	:invoke	:write	2
4	:invoke	:write	3
2	:invoke	:cas	[3 1]
3	:invoke	:read	1
0	:invoke	:read	1
4	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	0
0	:invoke	:read	0
2	:invoke	:read	0
3	:invoke	:cas	[0 0]
4	:invoke	:cas	[0 0]
0	:invoke	:write	0
1	:invoke	:write	2
1	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:cas	[2 1]
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:read	4
0	:invoke	:write	4
2	:invoke	:write	4
3	:invoke	:write	0
4	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 0]
0	:invoke	:read	0
2	:invoke	:write	1
0	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	1
4	:invoke	:cas	[1 4]
1	:invoke	:read	4
2	:invoke	:cas	[4 4]
0	:invoke	:read	4
4	:invoke	:cas	[4 0]
3	:invoke	:write	2
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:read	2
1	:invoke	:read	2
4	:invoke	:read	2
2	:invoke	:cas	[2 4]
0	:invoke	:write	0
2	:invoke	:write	0
0	:invoke	:read	0
4	:invoke	:read	0
2	:invoke	:cas	[0 2]
3	:invoke	:read	2
1	:invoke	:write	1
4	:invoke	:write	4
3	:invoke	:read	4
2	:invoke	:read	4
1	:invoke	:write	0
4	:invoke	:cas	[0 3]
3	:invoke	:write	4
0	:invoke	:read	4
1	:invoke	:read	4
2	:invoke	:read	4
3	:invoke	:read	4
0	:invoke	:write	3
1	:invoke	:read	3
3	:invoke	:read	3
0	:invoke	:read	3
3	:invoke	:write	3
2	:invoke	:write	2
0	:invoke	:write	0
2	:invoke	:read	0
3	:invoke	:cas	[0 4]
0	:invoke	:write	1
3	:invoke	:write	2
1	:invoke	:write	1
2	:invoke	:cas	[1 4]
3	:invoke	:write	1
0	:invoke	:write	0
4	:invoke	:read	0
2	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 2]
8	:invoke	:read	2
11	:invoke	:write	0
12	:invoke	:read	0
6	:invoke	:write	2
4	:invoke	:read	2
10	:invoke	:write	4

led to state: 
{:value 4}

with pending operations:
5	:invoke	:write	4
7	:invoke	:write	4
12	:invoke	:cas	[0 3]
3	:invoke	:cas	[0 4]

World with fixed history:
3	:invoke	:write	4
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
1	:invoke	:write	4
4	:invoke	:write	1
2	:invoke	:write	1
0	:invoke	:read	1
4	:invoke	:read	1
0	:invoke	:read	1
1	:invoke	:cas	[1 2]
0	:invoke	:cas	[2 1]
3	:invoke	:read	1
2	:invoke	:cas	[1 3]
4	:invoke	:read	3
0	:invoke	:write	2
3	:invoke	:cas	[2 0]
1	:invoke	:read	0
2	:invoke	:write	0
4	:invoke	:write	4
1	:invoke	:write	0
3	:invoke	:cas	[0 1]
4	:invoke	:read	1
3	:invoke	:write	2
4	:invoke	:write	3
2	:invoke	:cas	[3 1]
3	:invoke	:read	1
0	:invoke	:read	1
4	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	0
0	:invoke	:read	0
2	:invoke	:read	0
3	:invoke	:cas	[0 0]
4	:invoke	:cas	[0 0]
0	:invoke	:write	0
1	:invoke	:write	2
1	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:cas	[2 1]
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:read	4
0	:invoke	:write	4
2	:invoke	:write	4
3	:invoke	:write	0
4	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 0]
0	:invoke	:read	0
2	:invoke	:write	1
0	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	1
4	:invoke	:cas	[1 4]
1	:invoke	:read	4
2	:invoke	:cas	[4 4]
0	:invoke	:read	4
4	:invoke	:cas	[4 0]
3	:invoke	:write	2
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:read	2
1	:invoke	:read	2
4	:invoke	:read	2
2	:invoke	:cas	[2 4]
0	:invoke	:write	0
2	:invoke	:write	0
0	:invoke	:read	0
4	:invoke	:read	0
2	:invoke	:cas	[0 2]
3	:invoke	:read	2
1	:invoke	:write	1
4	:invoke	:write	4
3	:invoke	:read	4
2	:invoke	:read	4
1	:invoke	:write	0
4	:invoke	:cas	[0 3]
3	:invoke	:write	4
0	:invoke	:read	4
1	:invoke	:read	4
2	:invoke	:read	4
3	:invoke	:read	4
0	:invoke	:write	3
1	:invoke	:read	3
3	:invoke	:read	3
0	:invoke	:read	3
3	:invoke	:write	3
2	:invoke	:write	2
0	:invoke	:write	0
2	:invoke	:read	0
3	:invoke	:cas	[0 4]
0	:invoke	:write	1
3	:invoke	:write	2
1	:invoke	:write	1
2	:invoke	:cas	[1 4]
3	:invoke	:write	1
0	:invoke	:write	0
4	:invoke	:read	0
2	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 2]
8	:invoke	:read	2
11	:invoke	:write	0
12	:invoke	:read	0
6	:invoke	:write	2
4	:invoke	:read	2
10	:invoke	:write	4
7	:invoke	:write	4
5	:invoke	:write	4

led to state: 
{:value 4}

with pending operations:
12	:invoke	:cas	[0 3]
3	:invoke	:cas	[0 4]

World with fixed history:
3	:invoke	:write	4
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
1	:invoke	:write	4
4	:invoke	:write	1
2	:invoke	:write	1
0	:invoke	:read	1
4	:invoke	:read	1
0	:invoke	:read	1
1	:invoke	:cas	[1 2]
0	:invoke	:cas	[2 1]
3	:invoke	:read	1
2	:invoke	:cas	[1 3]
4	:invoke	:read	3
0	:invoke	:write	2
3	:invoke	:cas	[2 0]
1	:invoke	:read	0
2	:invoke	:write	0
4	:invoke	:write	4
1	:invoke	:write	0
3	:invoke	:cas	[0 1]
4	:invoke	:read	1
3	:invoke	:write	2
4	:invoke	:write	3
2	:invoke	:cas	[3 1]
3	:invoke	:read	1
0	:invoke	:read	1
4	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	0
0	:invoke	:read	0
2	:invoke	:read	0
3	:invoke	:cas	[0 0]
4	:invoke	:cas	[0 0]
0	:invoke	:write	0
1	:invoke	:write	2
1	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:cas	[2 1]
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:read	4
0	:invoke	:write	4
2	:invoke	:write	4
3	:invoke	:write	0
4	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 0]
0	:invoke	:read	0
2	:invoke	:write	1
0	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	1
4	:invoke	:cas	[1 4]
1	:invoke	:read	4
2	:invoke	:cas	[4 4]
0	:invoke	:read	4
4	:invoke	:cas	[4 0]
3	:invoke	:write	2
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:read	2
1	:invoke	:read	2
4	:invoke	:read	2
2	:invoke	:cas	[2 4]
0	:invoke	:write	0
2	:invoke	:write	0
0	:invoke	:read	0
4	:invoke	:read	0
2	:invoke	:cas	[0 2]
3	:invoke	:read	2
1	:invoke	:write	1
4	:invoke	:write	4
3	:invoke	:read	4
2	:invoke	:read	4
1	:invoke	:write	0
4	:invoke	:cas	[0 3]
3	:invoke	:write	4
0	:invoke	:read	4
1	:invoke	:read	4
2	:invoke	:read	4
3	:invoke	:read	4
0	:invoke	:write	3
1	:invoke	:read	3
3	:invoke	:read	3
0	:invoke	:read	3
3	:invoke	:write	3
2	:invoke	:write	2
0	:invoke	:write	0
2	:invoke	:read	0
3	:invoke	:cas	[0 4]
0	:invoke	:write	1
3	:invoke	:write	2
1	:invoke	:write	1
2	:invoke	:cas	[1 4]
3	:invoke	:write	1
0	:invoke	:write	0
4	:invoke	:read	0
2	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 2]
8	:invoke	:read	2
11	:invoke	:write	0
12	:invoke	:read	0
6	:invoke	:write	2
4	:invoke	:read	2
10	:invoke	:write	4
5	:invoke	:write	4

led to state: 
{:value 4}

with pending operations:
7	:invoke	:write	4
12	:invoke	:cas	[0 3]
3	:invoke	:cas	[0 4]

World with fixed history:
3	:invoke	:write	4
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
1	:invoke	:write	4
4	:invoke	:write	1
2	:invoke	:write	1
0	:invoke	:read	1
4	:invoke	:read	1
0	:invoke	:read	1
1	:invoke	:cas	[1 2]
0	:invoke	:cas	[2 1]
3	:invoke	:read	1
2	:invoke	:cas	[1 3]
4	:invoke	:read	3
0	:invoke	:write	2
3	:invoke	:cas	[2 0]
1	:invoke	:read	0
2	:invoke	:write	0
4	:invoke	:write	4
1	:invoke	:write	0
3	:invoke	:cas	[0 1]
4	:invoke	:read	1
3	:invoke	:write	2
4	:invoke	:write	3
2	:invoke	:cas	[3 1]
3	:invoke	:read	1
0	:invoke	:read	1
4	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	0
0	:invoke	:read	0
2	:invoke	:read	0
3	:invoke	:cas	[0 0]
4	:invoke	:cas	[0 0]
0	:invoke	:write	0
1	:invoke	:write	2
1	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:cas	[2 1]
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:read	4
0	:invoke	:write	4
2	:invoke	:write	4
3	:invoke	:write	0
4	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 0]
0	:invoke	:read	0
2	:invoke	:write	1
0	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	1
4	:invoke	:cas	[1 4]
1	:invoke	:read	4
2	:invoke	:cas	[4 4]
0	:invoke	:read	4
4	:invoke	:cas	[4 0]
3	:invoke	:write	2
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:read	2
1	:invoke	:read	2
4	:invoke	:read	2
2	:invoke	:cas	[2 4]
0	:invoke	:write	0
2	:invoke	:write	0
0	:invoke	:read	0
4	:invoke	:read	0
2	:invoke	:cas	[0 2]
3	:invoke	:read	2
1	:invoke	:write	1
4	:invoke	:write	4
3	:invoke	:read	4
2	:invoke	:read	4
1	:invoke	:write	0
4	:invoke	:cas	[0 3]
3	:invoke	:write	4
0	:invoke	:read	4
1	:invoke	:read	4
2	:invoke	:read	4
3	:invoke	:read	4
0	:invoke	:write	3
1	:invoke	:read	3
3	:invoke	:read	3
0	:invoke	:read	3
3	:invoke	:write	3
2	:invoke	:write	2
0	:invoke	:write	0
2	:invoke	:read	0
3	:invoke	:cas	[0 4]
0	:invoke	:write	1
3	:invoke	:write	2
1	:invoke	:write	1
2	:invoke	:cas	[1 4]
3	:invoke	:write	1
0	:invoke	:write	0
4	:invoke	:read	0
2	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 2]
8	:invoke	:read	2
11	:invoke	:write	0
12	:invoke	:read	0
3	:invoke	:cas	[0 4]
6	:invoke	:write	2
4	:invoke	:read	2
10	:invoke	:write	4
7	:invoke	:write	4

led to state: 
{:value 4}

with pending operations:
5	:invoke	:write	4
12	:invoke	:cas	[0 3]

World with fixed history:
3	:invoke	:write	4
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
1	:invoke	:write	4
4	:invoke	:write	1
2	:invoke	:write	1
0	:invoke	:read	1
4	:invoke	:read	1
0	:invoke	:read	1
1	:invoke	:cas	[1 2]
0	:invoke	:cas	[2 1]
3	:invoke	:read	1
2	:invoke	:cas	[1 3]
4	:invoke	:read	3
0	:invoke	:write	2
3	:invoke	:cas	[2 0]
1	:invoke	:read	0
2	:invoke	:write	0
4	:invoke	:write	4
1	:invoke	:write	0
3	:invoke	:cas	[0 1]
4	:invoke	:read	1
3	:invoke	:write	2
4	:invoke	:write	3
2	:invoke	:cas	[3 1]
3	:invoke	:read	1
0	:invoke	:read	1
4	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	0
0	:invoke	:read	0
2	:invoke	:read	0
3	:invoke	:cas	[0 0]
4	:invoke	:cas	[0 0]
0	:invoke	:write	0
1	:invoke	:write	2
1	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:cas	[2 1]
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:read	4
0	:invoke	:write	4
2	:invoke	:write	4
3	:invoke	:write	0
4	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 0]
0	:invoke	:read	0
2	:invoke	:write	1
0	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	1
4	:invoke	:cas	[1 4]
1	:invoke	:read	4
2	:invoke	:cas	[4 4]
0	:invoke	:read	4
4	:invoke	:cas	[4 0]
3	:invoke	:write	2
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:read	2
1	:invoke	:read	2
4	:invoke	:read	2
2	:invoke	:cas	[2 4]
0	:invoke	:write	0
2	:invoke	:write	0
0	:invoke	:read	0
4	:invoke	:read	0
2	:invoke	:cas	[0 2]
3	:invoke	:read	2
1	:invoke	:write	1
4	:invoke	:write	4
3	:invoke	:read	4
2	:invoke	:read	4
1	:invoke	:write	0
4	:invoke	:cas	[0 3]
3	:invoke	:write	4
0	:invoke	:read	4
1	:invoke	:read	4
2	:invoke	:read	4
3	:invoke	:read	4
0	:invoke	:write	3
1	:invoke	:read	3
3	:invoke	:read	3
0	:invoke	:read	3
3	:invoke	:write	3
2	:invoke	:write	2
0	:invoke	:write	0
2	:invoke	:read	0
3	:invoke	:cas	[0 4]
0	:invoke	:write	1
3	:invoke	:write	2
1	:invoke	:write	1
2	:invoke	:cas	[1 4]
3	:invoke	:write	1
0	:invoke	:write	0
4	:invoke	:read	0
2	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 2]
8	:invoke	:read	2
11	:invoke	:write	0
12	:invoke	:read	0
6	:invoke	:write	2
4	:invoke	:read	2
10	:invoke	:write	4
7	:invoke	:write	4

led to state: 
{:value 4}

with pending operations:
5	:invoke	:write	4
12	:invoke	:cas	[0 3]
3	:invoke	:cas	[0 4]

World with fixed history:
3	:invoke	:write	4
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
1	:invoke	:write	4
4	:invoke	:write	1
2	:invoke	:write	1
0	:invoke	:read	1
4	:invoke	:read	1
0	:invoke	:read	1
1	:invoke	:cas	[1 2]
0	:invoke	:cas	[2 1]
3	:invoke	:read	1
2	:invoke	:cas	[1 3]
4	:invoke	:read	3
0	:invoke	:write	2
3	:invoke	:cas	[2 0]
1	:invoke	:read	0
2	:invoke	:write	0
4	:invoke	:write	4
1	:invoke	:write	0
3	:invoke	:cas	[0 1]
4	:invoke	:read	1
3	:invoke	:write	2
4	:invoke	:write	3
2	:invoke	:cas	[3 1]
3	:invoke	:read	1
0	:invoke	:read	1
4	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	0
0	:invoke	:read	0
2	:invoke	:read	0
3	:invoke	:cas	[0 0]
4	:invoke	:cas	[0 0]
0	:invoke	:write	0
1	:invoke	:write	2
1	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:cas	[2 1]
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:write	4
3	:invoke	:read	4
1	:invoke	:read	4
0	:invoke	:write	4
2	:invoke	:write	4
3	:invoke	:write	0
4	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 0]
0	:invoke	:read	0
2	:invoke	:write	1
0	:invoke	:read	1
2	:invoke	:write	0
3	:invoke	:write	1
4	:invoke	:cas	[1 4]
1	:invoke	:read	4
2	:invoke	:cas	[4 4]
0	:invoke	:read	4
4	:invoke	:cas	[4 0]
3	:invoke	:write	2
1	:invoke	:write	2
4	:invoke	:read	2
2	:invoke	:read	2
0	:invoke	:read	2
1	:invoke	:read	2
4	:invoke	:read	2
2	:invoke	:cas	[2 4]
0	:invoke	:write	0
2	:invoke	:write	0
0	:invoke	:read	0
4	:invoke	:read	0
2	:invoke	:cas	[0 2]
3	:invoke	:read	2
1	:invoke	:write	1
4	:invoke	:write	4
3	:invoke	:read	4
2	:invoke	:read	4
1	:invoke	:write	0
4	:invoke	:cas	[0 3]
3	:invoke	:write	4
0	:invoke	:read	4
1	:invoke	:read	4
2	:invoke	:read	4
3	:invoke	:read	4
0	:invoke	:write	3
1	:invoke	:read	3
3	:invoke	:read	3
0	:invoke	:read	3
3	:invoke	:write	3
2	:invoke	:write	2
0	:invoke	:write	0
2	:invoke	:read	0
3	:invoke	:cas	[0 4]
0	:invoke	:write	1
3	:invoke	:write	2
1	:invoke	:write	1
2	:invoke	:cas	[1 4]
3	:invoke	:write	1
0	:invoke	:write	0
4	:invoke	:read	0
2	:invoke	:cas	[0 1]
1	:invoke	:cas	[1 2]
8	:invoke	:read	2
11	:invoke	:write	0
12	:invoke	:read	0
3	:invoke	:cas	[0 4]
6	:invoke	:write	2
4	:invoke	:read	2
10	:invoke	:write	4
7	:invoke	:write	4
5	:invoke	:write	4

led to state: 
{:value 4}

with pending operations:
12	:invoke	:cas	[0 3]

--------------------------------------------------------------

Inconsistent state transitions:
([{:value 4} "can't CAS 4 from 0 to 3"])
