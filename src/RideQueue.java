import java.util.NoSuchElementException;

public class RideQueue implements QueueADT<BoardingGroup> {
	private BGNode front=null,back=null;
	private int capacity=0,numOfPeople=0,numOfGroups=0;
	
	

	public RideQueue(int capacity) {

		this.capacity = capacity;
	}

	

	public void enqueue(BoardingGroup newGroup) {
		// TODO Auto-generated method stub
		if(numOfPeople+newGroup.getNumberofpeople()<=capacity)
		{
			if(newGroup.getVip()=="V")
			{
				BGNode node=new BGNode(newGroup);
				node.setNext(front);
				front=node;
				numOfGroups++;
				numOfPeople+=newGroup.getNumberofpeople();
				if(back==null)
					back=node;
			}
			else if(back==null && front==null)
			{
				BGNode node=new BGNode(newGroup);
				back=node;
				front=node;
				numOfGroups++;
				numOfPeople+=newGroup.getNumberofpeople();
			}
			else
			{
				BGNode node=new BGNode(newGroup);
				back.setNext(node);
				back=node;
				numOfGroups++;
				numOfPeople+=newGroup.getNumberofpeople();
				
			}
		}
		else
			 throw new IllegalStateException();
	}

	public int size() {
		
		// TODO Auto-generated method stub
		return numOfGroups;
	}

	public void clear() {
		// TODO Auto-generated method stub
		front=null;
		back=null;
		numOfGroups=0;
		numOfPeople=0;
		
	}

	public BoardingGroup peek() {
		// TODO Auto-generated method stub
		if(!isEmpty())
		return front.getGroup();
		throw new NoSuchElementException();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front==null)
			return true;
		return false;
	}

	public BoardingGroup dequeue() {
		// TODO Auto-generated method stub
		
		if(!isEmpty())
		{
		 BoardingGroup temp=front.getGroup();
		front=front.getNext();
		numOfPeople-=temp.getNumberofpeople();
		return temp;
		}
		throw new NoSuchElementException();
		
	}
	public String toString() {
		String s = "Number of People in Queue: " + numOfPeople + "\n";
		s += "Number of Groups in Queue: " + numOfGroups + "\n";
		s += "Group Names in Queue: ";
		BGNode current = front;
		while (current != null) {
		String groupName = current.getGroup().getName();
				/*CALL YOUR ACCESSOR FOR GROUP FOLLOWED BY
		YOUR ACCESSOR FOR NAME HERE ON current*/
		s += groupName + " ";
		current = current.getNext();
		}
		return s;
		}


	



}
