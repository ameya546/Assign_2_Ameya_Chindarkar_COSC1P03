# Assign_2_Ameya_Chindarkar_COSC1P03
1. createLinkedList(string text)

2. insert(int l, int s, string text)
        if ( s is null or s<0)
            insertLine(int l, string text)
        else
            insertText(int l, int s, string text)
3. insertLine(int l, string text)
           i. create linked list for text, call method
           ii. check Node[l], if its not null then 
                             move all lines starting from pos l down
           iv.  add linked list to pos l
4. insertText(int l, int s, string text)
    i.check if s ==0 then append two linkedlist and change head
ii. loop, till s reached or end of linked list, with index i
iii. check i == s then, insert in between
iv.else insert at end