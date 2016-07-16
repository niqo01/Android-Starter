package com.sweetmonkeys.compete.ui;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import butterknife.BindView;
import com.sweetmonkeys.compete.R;
import com.sweetmonkeys.compete.data.Injector;
import javax.inject.Inject;

import static butterknife.ButterKnife.bind;

public class TournamentsView extends CoordinatorLayout {
  @BindView(R.id.toolbar) Toolbar toolbarView;

  @Inject DrawerLayout drawerLayout;

  public TournamentsView(Context context, AttributeSet attrs) {
    super(context, attrs);
    if (!isInEditMode()) {
      Injector.obtain(context).inject(this);
    }
  }

  @Override protected void onFinishInflate() {
    super.onFinishInflate();
    bind(this);

    toolbarView.setTitle(R.string.tournament_title);
    toolbarView.setNavigationIcon(R.drawable.ic_google);
    toolbarView.setNavigationOnClickListener(new OnClickListener() {
      @Override public void onClick(View view) {
        drawerLayout.openDrawer(GravityCompat.START);
      }
    });

    //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    //fab.setOnClickListener(new View.OnClickListener() {
    //  @Override public void onClick(View view) {
    //    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
    //        .setAction("Action", null)
    //        .show();
    //  }
    //});

  }
}
