Not linearizable. Linearizable prefix was:
2	:invoke	:read	0
4	:invoke	:read	0
1	:invoke	:read	0
0	:invoke	:write	0
3	:invoke	:cas	[2 4]
0	:ok	:write	0
4	:ok	:read	0
2	:ok	:read	0
1	:ok	:read	0
3	:fail	:cas	[2 4]	:value-mismatch
2	:invoke	:read	0
2	:ok	:read	0
0	:invoke	:write	3
4	:invoke	:cas	[1 4]
1	:invoke	:cas	[4 3]
0	:ok	:write	3
3	:invoke	:cas	[2 4]
3	:fail	:cas	[2 4]	:value-mismatch
4	:fail	:cas	[1 4]	:value-mismatch
1	:fail	:cas	[4 3]	:value-mismatch
2	:invoke	:cas	[3 4]
2	:ok	:cas	[3 4]
3	:invoke	:cas	[0 3]
1	:invoke	:cas	[2 1]
3	:fail	:cas	[0 3]	:value-mismatch
1	:fail	:cas	[2 1]	:value-mismatch
4	:invoke	:write	4
0	:invoke	:write	0
4	:ok	:write	4
0	:ok	:write	0
2	:invoke	:read	0
2	:ok	:read	0
3	:invoke	:read	0
1	:invoke	:write	4
3	:ok	:read	0
1	:ok	:write	4
4	:invoke	:read	4
4	:ok	:read	4
0	:invoke	:read	4
0	:ok	:read	4
2	:invoke	:cas	[2 1]
2	:fail	:cas	[2 1]	:value-mismatch
3	:invoke	:read	4
3	:ok	:read	4
1	:invoke	:cas	[3 1]
1	:fail	:cas	[3 1]	:value-mismatch
4	:invoke	:read	4
4	:ok	:read	4
0	:invoke	:cas	[1 3]
0	:fail	:cas	[1 3]	:value-mismatch
2	:invoke	:read	4
2	:ok	:read	4
3	:invoke	:read	4
3	:ok	:read	4
1	:invoke	:cas	[0 3]
1	:fail	:cas	[0 3]	:value-mismatch
4	:invoke	:write	1
0	:invoke	:read	1
4	:ok	:write	1
0	:ok	:read	1
2	:invoke	:cas	[1 4]
2	:ok	:cas	[1 4]
3	:invoke	:cas	[0 1]
3	:fail	:cas	[0 1]	:value-mismatch
1	:invoke	:read	4
1	:ok	:read	4
4	:invoke	:cas	[4 0]
0	:invoke	:cas	[4 1]
4	:ok	:cas	[4 0]
0	:fail	:cas	[4 1]	:generation-mismatch
2	:invoke	:cas	[4 1]
2	:fail	:cas	[4 1]	:value-mismatch
3	:invoke	:cas	[0 3]
1	:invoke	:read	3
1	:ok	:read	3
3	:ok	:cas	[0 3]
4	:invoke	:read	3
4	:ok	:read	3
0	:invoke	:cas	[3 1]
0	:ok	:cas	[3 1]
2	:invoke	:write	4
2	:ok	:write	4
1	:invoke	:write	0
3	:invoke	:cas	[4 2]
1	:ok	:write	0
3	:fail	:cas	[4 2]	:value-mismatch
4	:invoke	:cas	[2 2]
4	:fail	:cas	[2 2]	:value-mismatch
0	:invoke	:write	4
0	:ok	:write	4
:nemesis	:info	:start	nil
2	:invoke	:cas	[4 3]
2	:ok	:cas	[4 3]
1	:invoke	:read	3
3	:invoke	:cas	[4 1]
1	:ok	:read	3
3	:fail	:cas	[4 1]	:value-mismatch
4	:invoke	:write	2
4	:ok	:write	2
0	:invoke	:write	0
0	:ok	:write	0
2	:invoke	:cas	[0 0]
2	:ok	:cas	[0 0]
1	:invoke	:cas	[4 3]
1	:fail	:cas	[4 3]	:value-mismatch
3	:invoke	:cas	[2 4]
3	:fail	:cas	[2 4]	:value-mismatch
4	:invoke	:write	4
4	:ok	:write	4
0	:invoke	:cas	[0 2]
0	:fail	:cas	[0 2]	:value-mismatch
:nemesis	:info	:start	"Cut off {:n1 #{:n2 :n5}, :n4 #{:n2 :n5}, :n3 #{:n2 :n5}, :n5 #{:n3 :n4 :n1}, :n2 #{:n3 :n4 :n1}}"
2	:invoke	:read	4
2	:ok	:read	4
1	:invoke	:write	3
3	:invoke	:cas	[4 0]
3	:fail	:cas	[4 0]	:value-mismatch
4	:invoke	:read	3
4	:ok	:read	3
0	:invoke	:cas	[0 4]
0	:fail	:cas	[0 4]	:value-mismatch
1	:info	:write	3	:timeout
2	:invoke	:read	3
2	:ok	:read	3
3	:invoke	:write	1
3	:ok	:write	1
4	:invoke	:cas	[0 3]
4	:fail	:cas	[0 3]	:value-mismatch
0	:invoke	:read	1
0	:ok	:read	1
6	:invoke	:cas	[4 3]
6	:info	:cas	[4 3]	:timeout
2	:invoke	:cas	[4 0]
2	:fail	:cas	[4 0]	:value-mismatch
3	:invoke	:cas	[1 2]
3	:ok	:cas	[1 2]
4	:invoke	:read	2
4	:ok	:read	2
0	:invoke	:write	1
0	:ok	:write	1
11	:invoke	:read	4

Followed by inconsistent operation:
11	:ok	:read	4

-------------------------------------------------------------
Just prior to that operation, possible interpretations of the
linearizable prefix were:
World with fixed history:
0	:invoke	:write	0
1	:invoke	:read	0
4	:invoke	:read	0
2	:invoke	:read	0
2	:invoke	:read	0
0	:invoke	:write	3
2	:invoke	:cas	[3 4]
4	:invoke	:write	4
0	:invoke	:write	0
2	:invoke	:read	0
3	:invoke	:read	0
1	:invoke	:write	4
4	:invoke	:read	4
0	:invoke	:read	4
3	:invoke	:read	4
4	:invoke	:read	4
2	:invoke	:read	4
3	:invoke	:read	4
4	:invoke	:write	1
0	:invoke	:read	1
2	:invoke	:cas	[1 4]
1	:invoke	:read	4
4	:invoke	:cas	[4 0]
3	:invoke	:cas	[0 3]
1	:invoke	:read	3
4	:invoke	:read	3
0	:invoke	:cas	[3 1]
2	:invoke	:write	4
1	:invoke	:write	0
0	:invoke	:write	4
2	:invoke	:cas	[4 3]
1	:invoke	:read	3
4	:invoke	:write	2
0	:invoke	:write	0
2	:invoke	:cas	[0 0]
4	:invoke	:write	4
2	:invoke	:read	4
1	:invoke	:write	3
4	:invoke	:read	3
2	:invoke	:read	3
3	:invoke	:write	1
0	:invoke	:read	1
3	:invoke	:cas	[1 2]
4	:invoke	:read	2
0	:invoke	:write	1

led to state: 
{:value 1}

with pending operations:
6	:invoke	:cas	[4 3]
11	:invoke	:read	4

--------------------------------------------------------------

Inconsistent state transitions:
([{:value 1} "can't read 4 from register 1"])
