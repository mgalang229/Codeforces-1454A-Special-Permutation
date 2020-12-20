#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

void solve() {
	int n;
	cin >> n;
	//just print 2, 3, ..., n, 1
	for(int i=0; i<n; ++i)
		cout << (i+1)%n+1 << " ";
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
