// Generated code from Butter Knife. Do not modify!
package it.feio.android.omninotes;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CategoryActivity$$ViewBinder<T extends it.feio.android.omninotes.CategoryActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820682, "field 'title'");
    target.title = finder.castView(view, 2131820682, "field 'title'");
    view = finder.findRequiredView(source, 2131820683, "field 'description'");
    target.description = finder.castView(view, 2131820683, "field 'description'");
    view = finder.findRequiredView(source, 2131820685, "field 'deleteBtn' and method 'deleteCategory'");
    target.deleteBtn = finder.castView(view, 2131820685, "field 'deleteBtn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.deleteCategory();
        }
      });
    view = finder.findRequiredView(source, 2131820686, "field 'saveBtn' and method 'saveCategory'");
    target.saveBtn = finder.castView(view, 2131820686, "field 'saveBtn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.saveCategory();
        }
      });
    view = finder.findRequiredView(source, 2131820684, "field 'colorChooser' and method 'showColorChooserCustomColors'");
    target.colorChooser = finder.castView(view, 2131820684, "field 'colorChooser'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.showColorChooserCustomColors();
        }
      });
  }

  @Override public void unbind(T target) {
    target.title = null;
    target.description = null;
    target.deleteBtn = null;
    target.saveBtn = null;
    target.colorChooser = null;
  }
}
