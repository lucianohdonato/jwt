import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  constructor(private http: HttpClient, private router: Router) { }

  public getAll(){
    let token = localStorage.getItem("token");
       return this.http.get("http://localhost:8080/produtos/all?token=" + token);
  }
}
