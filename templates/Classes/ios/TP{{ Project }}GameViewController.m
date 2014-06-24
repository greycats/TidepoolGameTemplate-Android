//
//  TP{{Project}}GameViewController.m
//  TP{{Project}}
//
//  Created by {{ author }} on {{ currentDate }}.
//  Copyright (c) 2014 Tidepool. All rights reserved.
//

#import "TP{{Project}}GameViewController.h"
#import "TP{{Project}}StageViewController.h"
#import "TP{{Project}}.h"

@interface TP{{Project}}GameViewController ()
@end

@implementation TP{{Project}}GameViewController

- (void)viewDidLoad
{
  self.StageClass = [TP{{Project}}StageViewController class];
  // TODO init numbers
  [super viewDidLoad];
}

- (void)configureStage:(TP{{Project}}StageViewController *)stage forLevel:(int)level
{
  [stage configureScene];
}

- (NSArray *)howToPlayInstructions
{
  return @[
           @{
             @"image":@"{{project.toLowerCase()}}.bundle/howtoplay-1.png",
             @"text":@"Repeat the pattern by tapping the same circles in the same order."
             },
           @{
             @"image":@"{{project.toLowerCase()}}.bundle/howtoplay-2.png",
             @"text":@"Repeat the pattern by tapping the same circles in the same order."
             },
           ];
}

@end
