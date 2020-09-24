#include <iostream>
#include <bits/stdc++.h>
using namespace std;
vector <int> adj[1000000];
int dist[10001], visted[100000];
void BFS(int src){
    queue <int> q;
    q.push(src);
    visted[src] = 1;
    dist[src] = 0;
       
        // While loop till queue became empty i.e BFS Operation
    while(!q.empty()) {
        // store the value of first element of queue into current node value
    int current = q.front();
    q.pop();
    for(int child: adj[current]){
    if(visted[child] ==0){
        q.push(child);
        dist[child] = dist[current] + 1;
        visted[child] = 1;
    }
        }
    } 
}
int main(){
    int t,N,M,X,Y;
    cin>>t;
    while(t--){
        
        cin>>N>>M;
        for(int i =1;i<=N;i++) adj[i].clear(), visted[i] = 0;
        for(int i = 0;i<M;i++){
             cin>>X>>Y;
            adj[X].push_back(Y);
            adj[Y].push_back(X);
        }
        BFS(1);    
        cout<<dist[N]<<endl;
    }
}
