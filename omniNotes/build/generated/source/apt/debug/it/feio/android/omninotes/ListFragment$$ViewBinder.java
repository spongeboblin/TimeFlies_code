// Generated code from Butter Knife. Do not modify!
package it.feio.android.omninotes;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ListFragment$$ViewBinder<T extends it.feio.android.omninotes.ListFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820788, "field 'listRoot'");
    target.listRoot = finder.castView(view, 2131820788, "field 'listRoot'");
    view = finder.findRequiredView(source, 2131820792, "field 'list'");
    target.list = finder.castView(view, 2131820792, "field 'list'");
    view = finder.findRequiredView(source, 2131820789, "field 'searchLayout'");
    target.searchLayout = view;
    view = finder.findRequiredView(source, 2131820790, "field 'searchQueryView'");
    target.searchQueryView = finder.castView(view, 2131820790, "field 'searchQueryView'");
    view = finder.findRequiredView(source, 2131820791, "field 'searchCancel'");
    target.searchCancel = finder.castView(view, 2131820791, "field 'searchCancel'");
    view = finder.findRequiredView(source, 2131820793, "field 'empyListItem'");
    target.empyListItem = finder.castView(view, 2131820793, "field 'empyListItem'");
    view = finder.findRequiredView(source, 2131820796, "field 'expandedImageView'");
    target.expandedImageView = finder.castView(view, 2131820796, "field 'expandedImageView'");
    view = finder.findRequiredView(source, 2131820765, "field 'fabView'");
    target.fabView = view;
    view = finder.findRequiredView(source, 2131820795, "field 'undoBarView'");
    target.undoBarView = view;
    view = finder.findRequiredView(source, 2131820794, "field 'progress_wheel'");
    target.progress_wheel = finder.castView(view, 2131820794, "field 'progress_wheel'");
    view = finder.findRequiredView(source, 2131820782, "field 'snackBarPlaceholder'");
    target.snackBarPlaceholder = view;
  }

  @Override public void unbind(T target) {
    target.listRoot = null;
    target.list = null;
    target.searchLayout = null;
    target.searchQueryView = null;
    target.searchCancel = null;
    target.empyListItem = null;
    target.expandedImageView = null;
    target.fabView = null;
    target.undoBarView = null;
    target.progress_wheel = null;
    target.snackBarPlaceholder = null;
  }
}
