////  main.cpp//  chips////  Created by Radu Costache on 29/10/2019.//  Copyright © 2019 Radu Costache. All rights reserved.// #include <iostream> using namespace std; int n, m, x, y, ans;int px[1005], py[1005]; int main(int argc, const char * argv[]) {    int i;    // insert code here...    cin >> n >> m;    for (i = 1; i <= m; ++i) {        cin >> x >> y;        px[x] = 1;        py[y] = 1;    }    for (i = 2; i < n; ++i) {        if(px[i] == 0)            ++ans;    }    for (i = 2; i < n; ++i) {        if(py[i] == 0) {            ++ans;        }    }    if((n % 2) && (px[n / 2 + 1] == 0) && (py[n / 2 + 1] == 0))        ans--;    cout << ans;    return 0;} 					 			 			 	   	 	     			
