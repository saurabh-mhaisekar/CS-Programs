// C Program for Stack operations


#include<stdio.h>
#include<stdlib.h>
struct Node{
	struct Node *next;
	int data;
};

void StackInsert(struct Node *node,int data);
void traverse(struct Node *head);

int main(){
	struct Node head;
	StackInsert(*head,10);
	
	return 0;
}

void StackInsert(struct Node *node, int data){
	struct Node *temp = NULL;
	temp->next = NULL;
	temp->data = data;

	if(node == NULL){
		node = temp;
	}
	else{
		node->next = temp;
	}
	free(temp);
}

void traverse(struct Node *head){
	if(head == NULL || head->next == NULL){
		printf("End of Stack");
		return;
	}
	printf("Data -> %d", head->data);
	traverse(head->next);
}

