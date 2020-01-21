import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { Produto } from 'src/app/model/Produto';
import { ProdutoService } from 'src/app/service/produto/produto.service';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent implements OnInit {

  public listaProdutos: Produto[];
  constructor(private produtoService: ProdutoService, private router: Router) { }

  ngOnInit() {
    this.produtoService.getAll().subscribe(
      (res: Produto[])=>{
          this.listaProdutos = res;
      },
      (err)=>{
        alert("Nao autenticado!!");
        this.router.navigate(["/login"]);
      });
  }

}
