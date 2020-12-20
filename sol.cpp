#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

void solve() {
	int n;
	cin >> n;
	int a[100];
	//assign values 1 to n in array
	for(int i=0; i<n; ++i)
		a[i]=i+1;
	//swap adjacent values so that p[i]!=i
	for(int i=0; i<n-1; ++i)
		swap(a[i], a[i+1]);
	for(int i=0; i<n; ++i)
		cout << a[i] << " ";
	cout << "\n";
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int t;
	cin >> t;
	while(t--)
		solve();
}
