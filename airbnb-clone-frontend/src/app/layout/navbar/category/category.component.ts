import { Component, inject, OnInit } from '@angular/core';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { CategoryService } from '../../category.service';
import { Category } from './category.model';

@Component({
  selector: 'app-category',
  standalone: true,
  imports: [FontAwesomeModule],
  templateUrl: './category.component.html',
  styleUrl: './category.component.scss',
})
export class CategoryComponent implements OnInit {
  
  catergoryService = inject(CategoryService);

  categories: Category[] | undefined;

  currentActivityCategory: Category =
    this.catergoryService.getCategoryByDefault();

  ngOnInit(): void {
    //Called after the constructor, initializing input properties, and the first call to ngOnChanges.
    //Add 'implements OnInit' to the class.
    this.fetchCategories();
  }

  fetchCategories() {
    this.categories = this.catergoryService.getCategories();
  }
}
